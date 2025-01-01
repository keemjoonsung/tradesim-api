package com.kjs990114.persistence

import com.kjs990114.data.PK
import com.kjs990114.domain.user.Trader
import com.kjs990114.domain.user.TraderRepository
import com.kjs990114.persistence.model.DBTrader
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class TraderJooqRepository(
    private val dsl: DSLContext,
): TraderRepository, TraderBaseJooq(dsl) {
    override fun findBy(pk: PK): Trader? {
        return baseSelect()
            .where(
                tTrader.USER_ID.equal(pk.getKey())
                .and(tTrader.DELETED.equal(false))
            )
            .fetchInto(DBTrader::class.java)
            .map { it.toDomain() }
            .firstOrNull()
    }

    override fun save(trader: Trader): Trader {
        return saveTrader(trader)
            .run { this.toDomain() }
    }

    override fun delete(pk: PK) {
        TODO("Not yet implemented")
    }

    private fun saveTrader(trader: Trader): DBTrader {
        return dsl
            .insertInto(tTrader)
            .set(tTrader.USER_ID, trader.userPK.getKey())
            .set(tTrader.NAME, trader.personal.name.value)
            .set(tTrader.CREATED_AT, trader.audit.createdAt)
            .set(tTrader.UPDATED_AT, trader.audit.updatedAt)
            .set(tTrader.DELETED, trader.deleted)
            .onDuplicateKeyUpdate()
            .set(tTrader.NAME, trader.personal.name.value)
            .set(tTrader.CREATED_AT, trader.audit.createdAt)
            .set(tTrader.UPDATED_AT, trader.audit.updatedAt)
            .set(tTrader.DELETED, trader.deleted)
            .returning(
                tTrader.USER_ID.`as`("user_pk"),
                tTrader.NAME.`as`("name"),
                tTrader.CREATED_AT.`as`("created_at"),
                tTrader.UPDATED_AT.`as`("updated_at"),
                tTrader.DELETED.`as`("deleted"),
            )
            .fetchInto(DBTrader::class.java)
            .first()
    }
}
