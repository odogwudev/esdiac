package com.example.esdiac.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navDeepLink
import androidx.navigation.navigation
import androidx.navigation.toRoute
import com.example.esdiac.offerdetail.OfferDetailScreenRoot
import com.example.esdiac.offerlist.OfferListScreenRoot
import kotlinx.serialization.Serializable

sealed interface TopUpGraphRoutes {
    @Serializable
    data object Graph: TopUpGraphRoutes

    @Serializable
    data object OfferListRoute: TopUpGraphRoutes

    @Serializable
    data class OfferDetailRoute(val offerId: String? = null): TopUpGraphRoutes
}

fun NavGraphBuilder.topUpGraph(
    navController: NavController,
    onLogout: () -> Unit
) {
    navigation<TopUpGraphRoutes.Graph>(
        startDestination = TopUpGraphRoutes.OfferListRoute
    ) {
        // Screen 1: Offer List
        composable<TopUpGraphRoutes.OfferListRoute> {
            OfferListScreenRoot(
                onOfferClick = { offerId ->
                    navController.navigate(TopUpGraphRoutes.OfferDetailRoute(offerId))
                },
                onLogoutClick = onLogout
            )
        }

        // Screen 2: Offer Detail
        composable<TopUpGraphRoutes.OfferDetailRoute>(
            deepLinks = listOf(
                navDeepLink {
                    uriPattern = "esdiac://offer_detail/{offerId}"
                }
            )
        ) { backStackEntry ->
            val route = backStackEntry.toRoute<TopUpGraphRoutes.OfferDetailRoute>()
            OfferDetailScreenRoot(
                offerId = route.offerId,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}