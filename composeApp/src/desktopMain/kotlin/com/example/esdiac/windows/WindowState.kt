package com.example.esdiac.windows

import java.util.UUID

data class WindowState(
    val id: String = UUID.randomUUID().toString(),
    val title: String = "Esdiac",
    val isFocused: Boolean = false
)
