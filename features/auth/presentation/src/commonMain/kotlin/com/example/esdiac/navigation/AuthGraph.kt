package com.example.esdiac.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navDeepLink
import androidx.navigation.navigation
import com.example.esdiac.screena.ScreenARoot
import com.example.esdiac.screenb.ScreenBRoot
import com.example.esdiac.screenc.ScreenCRoot

fun NavGraphBuilder.authGraph(
    navController: NavController,
    onLoginSuccess: () -> Unit,
) {
    navigation<AuthGraphRoutes.Graph>(
        startDestination = AuthGraphRoutes.ScreenA
    ) {
        composable<AuthGraphRoutes.ScreenA> {
            ScreenARoot(
                onBackClick = onLoginSuccess,
                onForwardClick = {
                    navController.navigate(AuthGraphRoutes.ScreenB){
                        launchSingleTop = true
                    }
                }
            )
        }
        composable<AuthGraphRoutes.ScreenB> {
            ScreenBRoot(
                onForwardClick = {
                    navController.navigate(AuthGraphRoutes.ScreenC(it))
                },
                onBackClick = {
                    navController.navigate(AuthGraphRoutes.ScreenB) {
                        popUpTo(AuthGraphRoutes.ScreenA) {
                            inclusive = true
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
        composable<AuthGraphRoutes.ScreenC> {
            ScreenCRoot(
                onForwardClick = {
                    onLoginSuccess()
                },
                onBackClick = {
                    navController.navigate(AuthGraphRoutes.ScreenC) {
                        popUpTo(AuthGraphRoutes.ScreenB) {
                            inclusive = true
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}