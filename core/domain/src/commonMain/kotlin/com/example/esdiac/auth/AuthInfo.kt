package com.example.esdiac.auth

data class AuthInfo(
    val accessToken: String,
    val refreshToken: String,
    val user: String
)
