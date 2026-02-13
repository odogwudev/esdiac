package com.example.esdiac.screena

sealed interface ScreenAAction {
    data object OnBtnClick : ScreenAAction
}