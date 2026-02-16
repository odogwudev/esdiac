package com.example.esdiac

import androidx.compose.ui.window.TrayState
import com.example.esdiac.windows.WindowState

data class ApplicationState(
    val windows: List<WindowState> = listOf(WindowState()),
    val themePreference: ThemePreference = ThemePreference.SYSTEM,
    val trayState: TrayState = TrayState()
)
