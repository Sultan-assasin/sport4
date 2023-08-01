package com.sula.sport4.screens.BannerScreen

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun BannerScreen() {
    Log.d("Screen", "BannerScreen")
    Surface(modifier = Modifier.fillMaxSize()) {
        Text(text = "BannerScreen", textAlign = TextAlign.Center, fontSize = 30.sp)
    }
}

