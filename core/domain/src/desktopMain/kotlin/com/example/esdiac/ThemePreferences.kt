package com.example.esdiac

import kotlinx.coroutines.flow.Flow

interface ThemePreferences {
    fun observeThemePreference(): Flow<ThemePreference>
    suspend fun updateThemePreference(theme: ThemePreference)
}