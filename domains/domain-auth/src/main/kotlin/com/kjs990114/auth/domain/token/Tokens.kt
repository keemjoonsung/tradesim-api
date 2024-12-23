package com.kjs990114.auth.domain.token

import com.kjs990114.auth.domain.user.AuthUser
import com.kjs990114.data.PK
import java.time.LocalDateTime

data class TokenPair(
    val accessToken: AuthToken,
    val refreshToken: AuthToken,

    val pk: PK,
    val userPk: PK,
)

data class AuthToken(
    val token: String,
    val expiredAt: LocalDateTime,
) {
    fun isExpired(base: LocalDateTime = LocalDateTime.now()) :Boolean {
        return expiredAt.isBefore(base)
    }
}


interface TokenManagement {
    fun generate(user: AuthUser): TokenPair
    fun validate(token: String): AuthUser
    fun refresh(accessToken: AuthToken, refreshToken: AuthToken): TokenPair
    fun remove(): AuthUser
}

// infrastructure에서 구현예정
interface TokenPairRepository {
    fun findBy(pk: PK): TokenPair?
    fun findByUser(userPk: PK): TokenPair?

    fun save(tokenPair: TokenPair): TokenPair
    fun delete(pk: PK)
}