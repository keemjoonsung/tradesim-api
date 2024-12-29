package com.kjs990114.auth.persistence

import com.kjs990114.auth.domain.user.AuthUser
import com.kjs990114.auth.domain.user.AuthUserRepository
import com.kjs990114.auth.domain.user.vo.Identifier
import com.kjs990114.auth.persistence.model.DBUser
import com.kjs990114.data.PK
import com.kjs990114.infra.persistence.jooq.trade.auth.tables.references.USER
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class UserJooqRepository(
    private val dsl: DSLContext
): AuthUserRepository, UserBaseJooq(dsl) {
    override fun findBy(pk: PK): AuthUser? {
        return baseSelect()
            .where(USER.ID.equal(pk.getKey()))
            .fetchInto(DBUser::class.java)
            .map{ it.toDomain() }
            .firstOrNull()
    }

    override fun findById(identifier: Identifier): AuthUser? {
        return baseSelect()
            .where(USER.IDENTIFIER.equal(identifier.value))
            .fetchInto(DBUser::class.java)
            .map { it.toDomain() }
            .firstOrNull()
    }

    override fun save(user: AuthUser): AuthUser {
        return insertOrUpdateUser(user).toDomain()
    }

    private fun insertOrUpdateUser(user: AuthUser): DBUser {
        return dsl
            .insertInto(USER)
            .set(USER.ID, user.pk.getKey())
            .set(USER.IDENTIFIER, user.identifier.value)
            .set(USER.PASSWORD, user.password.value)
            .set(USER.ROLE, user.role.name)
            .set(USER.WITHDRAWN, false)
            .set(USER.CREATED_AT, user.audit.createdAt)
            .set(USER.UPDATE_AT, user.audit.updatedAt)
            .onDuplicateKeyUpdate()
            .set(USER.IDENTIFIER, user.identifier.value)
            .set(USER.PASSWORD, user.password.value)
            .set(USER.ROLE, user.role.name)
            .set(USER.WITHDRAWN, user.withdrawn)
            .set(USER.UPDATE_AT, user.audit.updatedAt)
            .returning(
                USER.ID.`as`("pk"),
                USER.IDENTIFIER.`as`("identifier"),
                USER.PASSWORD.`as`("password"),
                USER.ROLE.`as`("role"),
                USER.WITHDRAWN.`as`("withdrawn"),
                USER.CREATED_AT.`as`("createdAt"),
                USER.UPDATE_AT.`as`("updatedAt"),
            )
            .fetchInto(DBUser::class.java)
            .first()
    }
}