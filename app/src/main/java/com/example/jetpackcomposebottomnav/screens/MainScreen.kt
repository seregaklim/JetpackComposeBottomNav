package com.example.jetpackcomposebottomnav.screens

import android.annotation.SuppressLint

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposebottomnav.bottom_navigation.BottomNavigation
import com.example.jetpackcomposebottomnav.bottom_navigation.NavGraph

//блокируем padding
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
      //сохраняем состояние контроллера
    val navController = rememberNavController()
    Scaffold(
       //выбираем где будут располагаться кнопки
        bottomBar = {
            BottomNavigation(navController = navController)
        }
    ) {
        NavGraph(navHostController = navController)
    }
}