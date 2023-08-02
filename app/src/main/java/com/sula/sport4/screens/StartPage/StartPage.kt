package com.sula.sport4.screens.StartPage

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sula.sport4.R
import com.sula.sport4.navigation.Screens
import com.sula.sport4.screens.FakeScreen.GreetingSection
import com.sula.sport4.ui.theme.IndigoДегайTheme


@Composable
fun StartScreen(navController: NavController) {
    Log.d("Screen", "StartScreen")
    Surface(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.image_preview), contentDescription = "",
            contentScale = ContentScale.Crop
        )
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    navController.navigate(Screens.FakeScreen.name)
                }, colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Yellow

                ),
                shape = RoundedCornerShape(50.dp)
                ,
                modifier = Modifier
                    .width(240.dp)
                    .height(100.dp)
                    .padding(bottom = 50.dp)
            ) {
                Text(
                    text = "Next",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewStartScreen(){
    StartScreen(navController = rememberNavController())
}