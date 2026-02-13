package com.example.esdiac.screenb

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
fun ScreenBRoot(
    onForwardClick: (String) -> Unit,
    onBackClick: () -> Unit
) {
    EsdiacSnackbarScaffold {
        EsdiacAdaptiveFormLayout(
            headerText =  ("Welcome to Screen B"),
            logo = {}
        ) {
            EsdiacButton(
                text = "Go to Screen C",
                onClick = {
                  onForwardClick.invoke("Hello from Screen B")
                },
                modifier = Modifier
                    .fillMaxWidth()
            )
            EsdiacButton(
                text = "Go Back to Screen A",
                onClick = {
                  onBackClick.invoke()
                },
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}