package com.diniauliya0015.asessment2mobpro.navigation

import KEY_ID_RESEP


sealed class Screen(val route: String) {
    data object Home : Screen("mainScreen")
    data object FormBaru : Screen("detailScreen")
    data object FormUbah : Screen("detailScreen/{$KEY_ID_RESEP}"){
        fun withId(id: Long) = "detailScreen/$id"
    }
}