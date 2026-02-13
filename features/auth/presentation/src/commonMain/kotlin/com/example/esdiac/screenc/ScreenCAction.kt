package com.example.esdiac.screenc

sealed interface ScreenCAction {
    data object OnBtnClick : ScreenCAction
}