package com.kjs990114.auth.persistence.token

import com.kjs990114.infra.persistence.jooq.trade.auth.tables.references.USER_TOKEN
import org.jooq.DSLContext

open class TokenPairBaseJooq(
    private val dsl: DSLContext
) {
    protected val tUserToken = USER_TOKEN

    protected fun baseSelect() = dsl
        .select(
            tUserToken.ID.`as`("pk"),
            tUserToken.USER_ID.`as`("user_pk"),

            tUserToken.ACCESS_TOKEN.`as`("access_token"),
            tUserToken.ACCESS_EXPIRED.`as`("access_expired"),
            tUserToken.REFRESH_TOKEN.`as`("refresh_token"),
            tUserToken.REFRESH_EXPIRED.`as`("refresh_expired"),

            tUserToken.CREATED_AT.`as`("created_at"),
        )
        .from(tUserToken)

    protected fun baseCount(): Long {
        TODO()
    }
}
