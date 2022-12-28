package com.efh.composenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.efh.composenavigation.screens.Home
import com.efh.composenavigation.screens.Profile
import com.efh.composenavigation.screens.Settings


@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(navController = navController,  startDestination = "Home") {


        //composable navigation içinde hangi ekranların olacağını belirler
        composable(
            route = "Home"
        ) {
            Home(
                onNavigate = {
                    navController.navigate(route = "Profile/user123")
                }
            )
        }



        composable(
            route = "Profile/{userId}",
            arguments = listOf(
                navArgument(name = "userId",) { type = NavType.StringType }
            )
        ) { backStackEntry ->

            Profile(
                onNavigate = {
                    navController.navigate(route = "Settings") {

                        // popUpTo ile geri tuşu çalışmaz stackten kaldırır
                        popUpTo("Profile") {
                            inclusive = true
                        }
                    }
                },
                userId = backStackEntry.arguments?.getString("userId") ?: ""
            )
        }



        composable(route = "Settings") {
            Settings(
                onNavigate = {
                    navController.navigate(route = "Home")
                }
            )
        }
    }
}




