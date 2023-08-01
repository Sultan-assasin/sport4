package com.sula.sport4.screens.FakeScreen

import androidx.compose.foundation.Image
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sula.sport4.R

@Composable
fun FoodInfo() {
    Column(modifier = Modifier.fillMaxSize()) {
        Surface {
            Image(
                painter = painterResource(id = R.drawable.img_1), contentDescription = "food",
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
            text = "Chickpea Salad",
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp)
        )

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = "Look, I'm not here to sugarcoat things or beat around the bush. If you have a problem with the fact that 2 + 2 is 4",
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
            Text(
                text = "30 min",
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
                modifier = Modifier.fillMaxWidth().height(50.dp).padding(start = 20.dp, end = 20.dp).clip(
                    RoundedCornerShape(30.dp)
                ),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
            ) {
                Text("ADD TO CART", fontSize = 20.sp, color = Color.White)
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun PreviewFoodInfo() {
    FoodInfo()
}