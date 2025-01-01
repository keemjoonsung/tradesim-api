package com.kjs990114.persistence

import com.kjs990114.infra.persistence.jooq.trade.trade.tables.references.TRADER
import org.jooq.DSLContext

open class TraderBaseJooq(
    private val dsl: DSLContext
) {
    protected val tTrader = TRADER

    protected fun baseSelect() = dsl
        .select(
            tTrader.USER_ID.`as`("user_pk"),
            tTrader.NAME.`as`("name"),
            tTrader.CREATED_AT.`as`("created_at"),
            tTrader.UPDATED_AT.`as`("updated_at"),
            tTrader.DELETED.`as`("deleted"),
        )
        .from(tTrader)

    protected fun baseCount(): Long {
        TODO()
    }
}