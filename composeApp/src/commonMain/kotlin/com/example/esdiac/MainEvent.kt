package com.example.esdiac

sealed interface MainEvent {
    data object OnSessionExpired: MainEvent
}