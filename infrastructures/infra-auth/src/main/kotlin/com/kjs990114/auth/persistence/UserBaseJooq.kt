package com.kjs990114.auth.persistence

import com.kjs990114.infra.persistence.jooq.trade.auth.tables.references.USER
import org.jooq.DSLContext

open class UserBaseJooq(
    private val dsl: DSLContext
) {
    protected fun baseSelect() = dsl
        .select(
            USER.ID.`as`("pk"),
            USER.IDENTIFIER.`as`("identifier"),
            USER.PASSWORD.`as`("password"),
            USER.ROLE.`as`("role"),
            USER.WITHDRAWN.`as`("withdrawn"),
            USER.CREATED_AT.`as`("createdAt"),
            USER.UPDATE_AT.`as`("updatedAt"),
        )
        .from(USER)
}