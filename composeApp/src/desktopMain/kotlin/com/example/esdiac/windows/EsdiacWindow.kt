package com.example.esdiac.windows

import androidx.compose.runtime.Composable
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyShortcut
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.MenuBar
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.rememberWindowState
import com.example.esdiac.App
import com.example.esdiac.theme.AppTheme
import esdiac.core.designsystem.generated.resources.Res
import esdiac.core.designsystem.generated.resources.eye_icon
import org.jetbrains.compose.resources.painterResource

@Composable
fun EsdiacWindow(
    appTheme: AppTheme,
    onCloseRequest: () -> Unit,
    onAddWindowClick: () -> Unit,
    onFocusChanged: (Boolean) -> Unit
) {
    val windowState = rememberWindowState(
        width = 1200.dp,
        height = 800.dp
    )
    Window(
        onCloseRequest = onCloseRequest,
        state = windowState,
        title = "Chirp",
        icon = painterResource(Res.drawable.eye_icon)
    ) {
        FocusObserver(
            onFocusChanged = onFocusChanged
        )

        MenuBar {
            Menu(
                text = "File",
                mnemonic = 'F'
            ) {
                Item(
                    text = "New Window",
                    mnemonic = 'N',
                    shortcut = KeyShortcut(
                        key = Key.N,
                        ctrl = true,
                        shift = true
                    ),
                    onClick = onAddWindowClick
                )
            }
        }

        App(
            isDarkTheme = appTheme == AppTheme.DARK
        )
    }
}