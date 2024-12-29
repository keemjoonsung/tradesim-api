package com.kjs990114.auth.domain.token

import com.kjs990114.auth.domain.user.BaseUser
import com.kjs990114.auth.domain.token.support.JWTAdapter
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.stereotype.Component
import java.time.Duration

//properties.yml에서 객체로 직렬화
@ConfigurationProperties(prefix = "trade.auth.token")
data class TokenProperties(
    val secret: String,
    val expiration : Expiration
){
    data class Expiration(
        val accessToken: Duration,
        val refreshToken: Duration,
    )
}
// domain-auth의 tokenManagement를 impl한 것
// generate , refresh , validate등등
@EnableConfigurationProperties(TokenProperties::class)
@Component
class TokenManagerImpl(
    private val config : TokenProperties,
    private val repository: TokenPairRepository,
): TokenManagement {
    private val adapter = JWTAdapter(config.secret)
    override fun generate(user: BaseUser): TokenPair {
        TODO("Not yet implemented")
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