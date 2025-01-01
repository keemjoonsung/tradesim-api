package com.kjs990114.auth.domain.token

import com.kjs990114.auth.domain.user.BaseUser
import com.kjs990114.auth.domain.token.support.JWTAdapter
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.stereotype.Component
import java.time.Duration
import java.time.LocalDateTime

@ConfigurationProperties(prefix = "trade.auth.token")
data class TokenProperties(
    val secret: String,
    val expiration: Expiration
){
    data class Expiration(
        val accessToken: Duration,
        val refreshToken: Duration,
    )
}

@EnableConfigurationProperties(TokenProperties::class)
@Component
class TokenManagerImpl(
    private val config : TokenProperties,
    private val repository: TokenPairRepository,
): TokenManagement {
    private val adapter = JWTAdapter(config.secret)

    override fun generate(user: BaseUser): TokenPair {
        val now = LocalDateTime.now()
        val expiration = config.expiration

        val accessToken = adapter.buildToken(user, now, expiration.accessToken)
        val refreshToken = adapter.buildToken(user, now, expiration.refreshToken)

        val token = TokenPair(
            userPk = user.pk,

            accessToken = accessToken,
            refreshToken = refreshToken,
        )

        return repository.save(token)
    }

    override fun validate(token: String): BaseUser {
        TODO("Not yet implemented")
    }

    override fun refresh(accessToken: AuthToken, refreshToken: AuthToken): TokenPair {
        TODO("Not yet implemented")
    }

    override fun remove(): BaseUser {
        TODO("Not yet implemented")
    }
}