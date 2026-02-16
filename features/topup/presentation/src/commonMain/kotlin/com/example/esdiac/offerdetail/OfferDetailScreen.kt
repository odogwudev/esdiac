package com.example.esdiac.offerdetail

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.esdiac.components.buttons.EsdiacButton
import com.example.esdiac.components.layout.EsdiacAdaptiveFormLayout
import com.example.esdiac.components.layout.EsdiacSnackbarScaffold

@Composable
fun OfferDetailScreenRoot(
    offerId: String?,
    onBackClick: () -> Unit
) {
    EsdiacSnackbarScaffold {
        EsdiacAdaptiveFormLayout(
            headerText = "Offer Details",
            logo = {}
        ) {
            // Display offer ID or placeholder
            EsdiacButton(
                text = "Offer ID: ${offerId ?: "No offer selected"}",
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )
            EsdiacButton(
                text = "Back to Offers",
                onClick = onBackClick,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

