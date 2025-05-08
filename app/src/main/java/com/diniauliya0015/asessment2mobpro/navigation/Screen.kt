package com.diniauliya0015.asessment2mobpro.navigation


sealed class Screen(val route: String) {
    data object Home : Screen("mainScreen")
    data object FormBaru : Screen("detailScreen")
}