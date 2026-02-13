package com.example.esdiac.screenb

sealed interface ScreenBAction {
    data object OnBtnClick : ScreenBAction
}