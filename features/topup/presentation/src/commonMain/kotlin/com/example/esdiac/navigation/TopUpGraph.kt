package com.example.esdiac.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navDeepLink
import androidx.navigation.navigation
import androidx.navigation.toRoute
import com.example.esdiac.ScreenARoot
import kotlinx.serialization.Serializable

sealed interface TopUpGraphRoutes {
    @Serializable
    data object Graph: TopUpGraphRoutes

    @Serializable
    data class OfferListDetailRoute(val offerId: String? = null): TopUpGraphRoutes
}

fun NavGraphBuilder.topUpGraph(
    navController: NavController,
    onLogout: () -> Unit
) {
    navigation<TopUpGraphRoutes.Graph>(
        startDestination = TopUpGraphRoutes.OfferListDetailRoute(null)
    ) {
        composable<TopUpGraphRoutes.OfferListDetailRoute>(
            deepLinks = listOf(
                navDeepLink {
                    uriPattern = "esdiac://offer_detail/{offerId}"
                }
            )
        ) { backStackEntry ->
            val route = backStackEntry.toRoute<TopUpGraphRoutes.OfferListDetailRoute>()
            ScreenARoot(
                initialOfferId = route.offerId,
                onForwardClick = {},
                onBackClick = onLogout,
            )
        }
    }
}