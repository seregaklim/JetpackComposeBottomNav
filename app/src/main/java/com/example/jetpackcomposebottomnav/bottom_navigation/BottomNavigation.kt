package com.example.jetpackcomposebottomnav.bottom_navigation

import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigation(
     //для переключения экранов
    navController: NavController
) {
    val listItems = listOf(
        BottomItem.Screen1,
        BottomItem.Screen2,
        BottomItem.Screen3,
        BottomItem.Screen4
    )
    androidx.compose.material.BottomNavigation(
        backgroundColor = Color.White
    ) {
        val backStackEntry by navController.currentBackStackEntryAsState()
        //экран , который щас открыт
        val currentRoute = backStackEntry?.destination?.route
        listItems.forEach { item ->
           //рисует все кнопки на экране
            BottomNavigationItem(
                // отмечает кнопку элемент, на котором экран
                selected = currentRoute == item.route,
                //переходим на экран
                onClick = {
                    navController.navigate(item.route)
                },
                icon = {
                   //передаем картинку
                    Icon(
                        painter = painterResource(id = item.iconId),
                        contentDescription = "Icon"
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 9.sp
                    )
                },
               //цвет выбраного элемента
                selectedContentColor = Color.Red,
                //невыбранный
                unselectedContentColor = Color.Gray
            )
        }
    }
}



