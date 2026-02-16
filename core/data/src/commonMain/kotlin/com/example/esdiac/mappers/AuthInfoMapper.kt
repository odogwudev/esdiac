package com.example.esdiac.mappers

import com.example.esdiac.auth.AuthInfo
import com.example.esdiac.auth.AuthInfoSerializable

fun AuthInfoSerializable.toDomain(): AuthInfo {
    return AuthInfo(
        accessToken = "",
        refreshToken = "",
        user = ""
    )
}