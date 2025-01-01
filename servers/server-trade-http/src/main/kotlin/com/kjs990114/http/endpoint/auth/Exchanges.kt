package com.kjs990114.http.endpoint.auth

import com.kjs990114.auth.domain.token.TokenPair

data class LoginRequest(
    val email: String,
    val password: String,
)

data class TokenResponse(
    val accessToken: String,
    val refreshToken: String,
) {
    companion object{
        fun from(tokenPair: TokenPair): TokenResponse {
            return TokenResponse(
                tokenPair.accessToken.token,
                tokenPair.refreshToken.token,
            )
        }
    }
}