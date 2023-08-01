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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sula.sport4.R
import com.sula.sport4.navigation.Screens


@Composable
fun StartScreen(navController: NavController) {
    Log.d("Screen", "StartScreen")
    Surface(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.hock), contentDescription = "",
            contentScale = ContentScale.Crop
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    navController.navigate(Screens.FakeScreen.name)
                }, colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Blue

                ),
                shape = RoundedCornerShape(15.dp)
                ,
                modifier = Modifier
                    .width(150.dp)
                    .height(50.dp)
            ) {
                Text(
                    text = "Start Banner",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}