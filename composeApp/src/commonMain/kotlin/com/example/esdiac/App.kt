package com.example.esdiac

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.rememberNavController
import com.example.esdiac.navigation.AuthGraphRoutes
import com.example.esdiac.navigation.NavigationRoot
import com.example.esdiac.navigation.TopUpGraphRoutes
import com.example.esdiac.theme.EsdiacTheme
import com.example.esdiac.utiks.ObserveAsEvents
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    onAuthenticationChecked: () -> Unit = {},
    viewModel: MainViewModel = koinViewModel()
) {
    val navController = rememberNavController()
    val state by viewModel.state.collectAsStateWithLifecycle()

    LaunchedEffect(state.socketUrl) {
        if(state.socketUrl!=null) {
            onAuthenticationChecked()
        }
    }

    ObserveAsEvents(viewModel.events) { event ->
        when(event) {
            is MainEvent.OnSessionExpired -> {
                navController.navigate(AuthGraphRoutes.Graph) {
                    popUpTo(AuthGraphRoutes.Graph) {
                        inclusive = false
                    }
                }
            }
        }
    }

    EsdiacTheme (
        darkTheme = isDarkTheme
    ) {
            NavigationRoot(
                navController = navController,
                startDestination = if(state.socketUrl!=null) {
                    TopUpGraphRoutes.Graph
                } else {
                    AuthGraphRoutes.Graph
                }
            )

    }
}