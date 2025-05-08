package com.diniauliya0015.asessment2mobpro.navigation

import DetailScreen
import KEY_ID_RESEP
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.diniauliya0015.asessment2mobpro.ui.screen.MainScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(route = Screen.Home.route) {
            MainScreen(navController)
        }
        composable(route = Screen.FormBaru.route) {
            DetailScreen(navController)
        }
        composable(
            route = Screen.FormUbah.route,
            arguments = listOf((
                    navArgument(KEY_ID_RESEP) {type = NavType.LongType}
                    )
            )
        ) {
            navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getLong(KEY_ID_RESEP)
            DetailScreen(navController, id)
        }
    }
}