package com.kjs990114.auth.domain.token.support

import com.kjs990114.auth.domain.token.AuthToken
import com.kjs990114.auth.domain.user.BaseUser
import com.kjs990114.auth.domain.user.vo.Identifier
import com.kjs990114.auth.domain.user.vo.Password
import com.kjs990114.auth.domain.user.vo.Role
import com.kjs990114.data.Audit
import com.kjs990114.data.PK
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.io.Decoders
import io.jsonwebtoken.security.Keys
import java.time.Duration
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

internal class JWTAdapter(
    secret: String
) {
    private val key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secret))
    private val parser = Jwts.parser().verifyWith(key).build()

    fun buildToken(user: BaseUser, now: LocalDateTime, duration: Duration): AuthToken {
        return build(user, now, duration)
    }

    fun parse(token: String): Pair<BaseUser, AuthToken> {
        val claims = parser.parseSignedClaims(token).payload

        val authToken = AuthToken(
            token = token,
            expiredAt = claims.expiration.toLocalDateTime(),
        )
        val user = BaseUser(
            pk = PK.of(claims.id.toLong()),
            identifier = Identifier.of(claims.subject),
            role = Role.of(claims[CLAIM_KEY_ROLE, String::class.java]),
            withdrawn = false,
            password = Password.NONE,
            audit = Audit.NONE,
        )

        return Pair(user, authToken)
    }

    private fun build(user: BaseUser, base: LocalDateTime, duration: Duration): AuthToken {
        val expired = base.plus(duration)

        val token = Jwts.builder()
            .header()
                .type("JWT")
            .and()
            .claims()
                .id(user.pk.getKey().toString())
                .subject(user.identifier.value)
                .expiration(expired.toDate())
                .add(CLAIM_KEY_ROLE, user.role.name)
            .and()
            .signWith(key)
            .compact()

        return AuthToken(token, expired)
    }

    private fun LocalDateTime.toDate(): Date {
        return Date.from(this.atZone(ZoneId.systemDefault()).toInstant())
    }

    private fun Date.toLocalDateTime(): LocalDateTime {
        return LocalDateTime.ofInstant(this.toInstant(), ZoneId.systemDefault())
    }

    companion object {
        private const val CLAIM_KEY_ROLE = "role"
    }
}