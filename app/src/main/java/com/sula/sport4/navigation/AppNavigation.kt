package com.sula.sport4.navigation


import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sula.sport4.data.Food
import com.sula.sport4.screens.StartPage.StartScreen
import com.sula.sport4.screens.BannerScreen.BannerScreen
import com.sula.sport4.screens.FakeScreen.FakeScreenViewModel
import com.sula.sport4.screens.MainScreen.MainScreen
import com.sula.sport4.screens.SplashScreen.SplashScreen
import com.sula.sport4.screens.FakeScreen.FakeScreen
import com.sula.sport4.screens.FakeScreen.FoodInfo


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AppNavigation(viewModel: FakeScreenViewModel = hiltViewModel()) {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Screens.SplashScreen.name ){
        composable(Screens.MainScreen.name+"/{id}"){ backStackEntry ->
            val id= backStackEntry.arguments?.getString("id")
            MainScreen(navController, link = id)
        }
        composable(Screens.FakeScreen.name){
            FakeScreen(navController)
        }
        composable(Screens.SplashScreen.name){
            SplashScreen(navController = navController )
        }

        composable(Screens.StartScreen.name){
            StartScreen(navController = navController)
        }
        composable(Screens.BannerScreen.name){
            BannerScreen()
        }
        composable(Screens.FoodInfo.name){
            val result =
                navController.previousBackStackEntry?.savedStateHandle?.get<Food>("food")
            Log.d("FoodInfo Screen"," ${result?.foodName}")
            Log.d("FoodInfo Screen", "${result?.image}")
            FoodInfo(navController)
        }
    }

}