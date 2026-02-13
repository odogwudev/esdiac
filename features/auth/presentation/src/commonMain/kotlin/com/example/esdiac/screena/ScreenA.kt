package com.example.esdiac.screena

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.esdiac.components.buttons.EsdiacButton
import com.example.esdiac.components.layout.EsdiacAdaptiveFormLayout
import com.example.esdiac.components.layout.EsdiacSnackbarScaffold
import com.example.esdiac.navigation.AuthGraphRoutes
import com.example.esdiac.theme.EsdiacTheme
import esdiac.features.auth.presentation.generated.resources.Res
import org.jetbrains.compose.resources.stringResource


@Composable
fun ScreenARoot(
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