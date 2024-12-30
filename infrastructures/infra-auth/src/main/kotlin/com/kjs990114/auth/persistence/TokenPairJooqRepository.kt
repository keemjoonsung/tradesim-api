package com.kjs990114.auth.persistence

import com.kjs990114.auth.domain.token.TokenPair
import com.kjs990114.auth.domain.token.TokenPairRepository
import com.kjs990114.data.PK
import org.springframework.stereotype.Repository

@Repository
class TokenPairJooqRepository: TokenPairRepository {
    override fun findBy(pk: PK): TokenPair? {
        TODO("Not yet implemented")
    }

    override fun findByUser(userPk: PK): TokenPair? {
        TODO("Not yet implemented")
    }

    override fun save(tokenPair: TokenPair): TokenPair {
        TODO("Not yet implemented")
    }

    override fun delete(pk: PK) {
        TODO("Not yet implemented")
    }
}