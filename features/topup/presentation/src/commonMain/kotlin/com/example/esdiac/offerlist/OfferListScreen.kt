package com.example.esdiac.offerlist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.esdiac.components.buttons.EsdiacButton
import com.example.esdiac.components.layout.EsdiacAdaptiveFormLayout
import com.example.esdiac.components.layout.EsdiacSnackbarScaffold

@Composable
fun OfferListScreenRoot(
    onOfferClick: (String) -> Unit,
    onLogoutClick: () -> Unit
) {
    // Sample offer IDs for demonstration
    val offers = listOf("offer_1", "offer_2", "offer_3", "offer_4")

    EsdiacSnackbarScaffold {
        EsdiacAdaptiveFormLayout(
            headerText = "Available Offers",
            logo = {}
        ) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(offers) { offerId ->
                    EsdiacButton(
                        text = "View Offer: $offerId",
                        onClick = { onOfferClick(offerId) },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            EsdiacButton(
                text = "Logout",
                onClick = onLogoutClick,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

