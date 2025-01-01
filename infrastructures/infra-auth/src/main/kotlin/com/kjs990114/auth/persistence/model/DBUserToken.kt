package com.kjs990114.auth.persistence.model

import com.kjs990114.auth.domain.token.AuthToken
import com.kjs990114.auth.domain.token.TokenPair
import com.kjs990114.data.PK
import java.time.LocalDateTime

data class DBUserToken(
    private val pk: Long,
    private val userPK: Long,

    private val accessToken: String,
    private val accessExpired: LocalDateTime,
    private val refreshToken: String,
    private val refreshExpired: LocalDateTime,

    private val createdAt: LocalDateTime,
) {
    fun toDomain(): TokenPair {
        return TokenPair(
            pk = PK.of(pk),
            userPk = PK.of(userPK),
            accessToken = AuthToken(accessToken, accessExpired),
            refreshToken = AuthToken(refreshToken, refreshExpired),
        )
    }
}