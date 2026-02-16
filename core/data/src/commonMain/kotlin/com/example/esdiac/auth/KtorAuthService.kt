package com.example.esdiac.auth

import io.ktor.client.HttpClient
import io.ktor.client.plugins.auth.authProvider
import io.ktor.client.plugins.auth.providers.BearerAuthProvider

class KtorAuthService(
    private val httpClient: HttpClient
): AuthService {

//    override suspend fun login(
//        email: String,
//        password: String
//    ): Result<AuthInfo, DataError.Remote> {
//        return httpClient.post<LoginRequest, AuthInfoSerializable>(
//            route = "/auth/login",
//            body = LoginRequest(
//                email = email,
//                password = password
//            )
//        ).map { authInfoSerializable ->
//            authInfoSerializable.toDomain()
//        }
//    }
}