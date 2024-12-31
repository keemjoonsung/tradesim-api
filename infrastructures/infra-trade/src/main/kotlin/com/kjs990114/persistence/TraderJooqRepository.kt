package com.kjs990114.persistence

import com.kjs990114.data.PK
import com.kjs990114.domain.user.Trader
import com.kjs990114.domain.user.TraderRepository
import org.springframework.stereotype.Repository

@Repository
class TraderJooqRepository: TraderRepository {
    override fun findBy(pk: PK): Trader? {
        TODO("Not yet implemented")
    }

    override fun save(trader: Trader): Trader {
        TODO("Not yet implemented")
    }

    override fun delete(pk: PK) {
        TODO("Not yet implemented")
    }
}