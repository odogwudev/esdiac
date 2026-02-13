package com.example.esdiac

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform