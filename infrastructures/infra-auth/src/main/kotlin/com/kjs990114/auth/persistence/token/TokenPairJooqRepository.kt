package com.kjs990114.auth.persistence.token

import com.kjs990114.auth.domain.token.TokenPair
import com.kjs990114.auth.domain.token.TokenPairRepository
import com.kjs990114.auth.persistence.model.DBUserToken
import com.kjs990114.data.PK
import com.kjs990114.infra.persistence.jooq.trade.auth.tables.references.USER_TOKEN
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
class TokenPairJooqRepository(
    private val dsl: DSLContext,
): TokenPairRepository, TokenPairBaseJooq(dsl) {
    override fun findBy(pk: PK): TokenPair? {
        return baseSelect()
            .where(USER_TOKEN.ID.equal(pk.getKey()))
            .fetchInto(DBUserToken::class.java)
            .map { it.toDomain() }
            .firstOrNull()
    }


    override fun findByUser(userPk: PK): TokenPair? {
        return baseSelect()
            .where(USER_TOKEN.USER_ID.equal(userPk.getKey()))
            .fetchInto(DBUserToken::class.java)
            .map { it.toDomain() }
            .firstOrNull()
    }

    override fun save(tokenPair: TokenPair): TokenPair {
        return saveTokenPair(tokenPair)
    }

    override fun delete(pk: PK) {
        dsl.deleteFrom(tUserToken)
            .where(tUserToken.ID.equal(pk.getKey()))
    }

    private fun saveTokenPair(tokenPair: TokenPair): TokenPair {
        return dsl
            .insertInto(tUserToken)
            .set(tUserToken.USER_ID, tokenPair.userPk.getKey())
            .set(tUserToken.ACCESS_TOKEN, tokenPair.accessToken.token)
            .set(tUserToken.ACCESS_EXPIRED, tokenPair.accessToken.expiredAt)
            .set(tUserToken.REFRESH_TOKEN, tokenPair.refreshToken.token)
            .set(tUserToken.REFRESH_EXPIRED, tokenPair.refreshToken.expiredAt)
            .set(tUserToken.CREATED_AT, LocalDateTime.now())
            .returning(tUserToken.ID)
            .fetchOne { tokenPair.copy(pk = PK.from(it.id))}!!
    }
}