package com.kjs990114.auth.persistence.user

import com.kjs990114.infra.persistence.jooq.trade.auth.tables.references.USER
import org.jooq.DSLContext

open class UserBaseJooq(
    private val dsl: DSLContext
) {
    protected val tUser = USER

    protected fun baseSelect() = dsl
        .select(
            tUser.ID.`as`("pk"),
            tUser.IDENTIFIER.`as`("identifier"),
            tUser.PASSWORD.`as`("password"),
            tUser.ROLE.`as`("role"),
            tUser.WITHDRAWN.`as`("withdrawn"),
            tUser.CREATED_AT.`as`("created_at"),
            tUser.UPDATED_AT.`as`("updated_at"),
        )
        .from(tUser)

    protected fun baseCount(): Long {
        TODO()
    }
}