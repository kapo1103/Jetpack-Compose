package com.efh.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.efh.components.ui.theme.HomeScreen

//tıklandıgında geçiş yapma

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.route
    ) {
        composable(route = BottomNavItem.Home.route)
        {
            HomeScreen()
        }

        composable(route = BottomNavItem.Report.route)
        {
            ReportScreen()
        }
        composable(route = BottomNavItem.Profile.route)
        {
            ProfileScreen()
        }


    }

}
