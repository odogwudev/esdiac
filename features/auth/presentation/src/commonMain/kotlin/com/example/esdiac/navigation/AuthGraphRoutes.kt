package com.example.esdiac.navigation

import kotlinx.serialization.Serializable

sealed interface AuthGraphRoutes {
    @Serializable
    data object Graph : AuthGraphRoutes

    @Serializable
    data object ScreenA : AuthGraphRoutes

    @Serializable
    data object ScreenB : AuthGraphRoutes

    @Serializable
    data class ScreenC(val text: String) : AuthGraphRoutes
}