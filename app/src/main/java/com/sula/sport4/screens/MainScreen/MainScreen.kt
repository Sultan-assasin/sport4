package com.sula.sport4.screens.MainScreen

import android.annotation.SuppressLint
import android.util.Log
import android.webkit.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.sula.sport4.navigation.Screens

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun MainScreen(navController: NavController, link: String?) {
    val context = LocalContext.current
    Log.d("Screen", "MainScreen")
    Log.d("SASA","${link}")
    val webView = remember {
        WebView(context).apply {
            val cookieManager = CookieManager.getInstance()
            cookieManager.setAcceptCookie(true)
            settings.apply {
                javaScriptEnabled = true
                domStorageEnabled = true
                cacheMode = WebSettings.LOAD_DEFAULT
            }
            webViewClient = object : WebViewClient() {
                override fun onPageFinished(view: WebView?, url: String?) {
                    evaluateJavascript("(function() { return document.body.innerText; })()") { result ->
                        val resultWithoutQuotes =
                            result?.substring(1, result.length - 1)
                        Log.d("SASA","$resultWithoutQuotes")
                        if (resultWithoutQuotes.equals("Loading")) {
                            this@apply.destroy()
                            navController.navigate(Screens.StartScreen.name){
                                popUpTo(0)
                            }
                        }
                    }
                }
            }
            webChromeClient = WebChromeClient()
        }
    }

    LaunchedEffect(link) {
        webView.loadUrl("https://bosses.kz/$link")
    }

    Surface(modifier = Modifier.fillMaxSize()) {
        AndroidView({ webView })
    }
}

