package com.sula.sport4.screens.FakeScreen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sula.sport4.R
import com.sula.sport4.data.Food
import java.util.Random

@Composable
fun FoodInfo(navController: NavController) {

    var randomNumber by remember { mutableStateOf(10) }

    val food = navController.previousBackStackEntry?.savedStateHandle?.get<Food>("food")
    Log.d("FoodInfo Screen"," ${food?.foodName}")
    // create some food classes and equal results
    Log.d("FoodInfo Screen", "${food?.image}") // create some food classes and equal results
    Column(modifier = Modifier.fillMaxSize()) {
        Surface {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back", modifier = Modifier
                .height(40.dp)
                .width(40.dp)
                .clickable { navController.popBackStack() })
            Image(
                painter = painterResource(id = food?.image ?:  R.drawable.img_1), contentDescription = "food",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                    .padding(top = 40.dp),
                contentScale = ContentScale.FillBounds
            )
        }
        Text(
            text = "Mediterranean",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp)
        )
        Text(
            text = food?.foodName ?: "sportsman food",
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp)
        )

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = stringResource(id = R.string.food_info),
            fontSize = 18.sp,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
        )
        Row {
            Text(
                text = "Delivery Time",
                modifier = Modifier.padding(start = 20.dp, top = 4.dp, end = 20.dp),
                fontSize = 16.sp
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_time),
                contentDescription = "time",
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
            randomNumber = getRandomNumber()
            Text(
                text = "$randomNumber",
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 7.dp, top = 4.dp),
                fontWeight = FontWeight.Bold
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.BottomCenter // Align content at the bottom center of the screen
        ) {
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 20.dp, end = 20.dp)
                    .clip(
                        RoundedCornerShape(30.dp)
                    ),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
            ) {
                Text("ADD TO CART", fontSize = 20.sp, color = Color.White)
            }
        }
    }
}
fun getRandomNumber(): Int {

    val randomNumber = (20..80).random()

    return randomNumber
}

@Composable
@Preview(showBackground = true)
fun PreviewFoodInfo() {
    FoodInfo(rememberNavController())
}