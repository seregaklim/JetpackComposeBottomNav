package com.example.jetpackcomposebottomnav.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcomposebottomnav.screens.Screen1
import com.example.jetpackcomposebottomnav.screens.Screen3
import com.example.jetpackcomposebottomnav.screens.Screen4
import com.example.jetpackcomposebottomnav.screens.Screen2
@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "screen_1"){
        composable("screen_1"){
            Screen1()
        }
        composable("screen_2"){
           Screen2()
        }
        composable("screen_3"){
            Screen3()
        }
        composable("screen_4"){
            Screen4()
        }
    }
}




