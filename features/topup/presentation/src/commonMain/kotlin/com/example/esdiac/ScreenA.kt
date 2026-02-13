package com.example.esdiac

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.esdiac.components.buttons.EsdiacButton
import com.example.esdiac.components.layout.EsdiacAdaptiveFormLayout
import com.example.esdiac.components.layout.EsdiacSnackbarScaffold


@Composable
fun ScreenARoot(
    initialOfferId: String?,
    onForwardClick: () -> Unit,
    onBackClick: () -> Unit
) {
    EsdiacSnackbarScaffold {
        EsdiacAdaptiveFormLayout(
            headerText =  ("Welcome to Screen A"),
            logo = {}
        ) {
            EsdiacButton(
                text = "Go to Screen B",
                onClick = {
                 onForwardClick()
                },
                modifier = Modifier
                    .fillMaxWidth()
            )
            EsdiacButton(
                text = "Go to Screen",
                onClick = {
                 onBackClick()
                },
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}