package com.kjs990114.auth.persistence

import com.kjs990114.auth.domain.user.BaseUser
import com.kjs990114.auth.domain.user.BaseUserRepository
import com.kjs990114.auth.domain.user.vo.Identifier
import com.kjs990114.auth.persistence.model.DBUser
import com.kjs990114.data.PK
import com.kjs990114.infra.persistence.jooq.trade.auth.tables.references.USER
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class UserJooqRepository(
    private val dsl: DSLContext
): BaseUserRepository, UserBaseJooq(dsl) {
    override fun findBy(pk: PK): BaseUser? {
        return baseSelect()
            .where(USER.ID.equal(pk.getKey()))
            .fetchInto(DBUser::class.java)
            .map{ it.toDomain() }
            .firstOrNull()
    }

    override fun findById(identifier: Identifier): BaseUser? {
        return baseSelect()
            .where(USER.IDENTIFIER.equal(identifier.value))
            .fetchInto(DBUser::class.java)
            .map { it.toDomain() }
            .firstOrNull()
    }

    override fun save(user: BaseUser): BaseUser {
        return insertOrUpdateUser(user).toDomain()
    }

    private fun insertOrUpdateUser(user: BaseUser): DBUser {
        return dsl
            .insertInto(USER)
            .set(USER.ID, user.pk.getOriginal())
            .set(USER.IDENTIFIER, user.identifier.value)
            .set(USER.PASSWORD, user.password.value)
            .set(USER.ROLE, user.role.name)
            .set(USER.WITHDRAWN, false)
            .set(USER.CREATED_AT, user.audit.createdAt)
            .set(USER.UPDATED_AT, user.audit.updatedAt)
            .onDuplicateKeyUpdate()
            .set(USER.IDENTIFIER, user.identifier.value)
            .set(USER.PASSWORD, user.password.value)
            .set(USER.ROLE, user.role.name)
            .set(USER.WITHDRAWN, user.withdrawn)
            .set(USER.UPDATED_AT, user.audit.updatedAt)
            .returning(
                USER.ID.`as`("id"),
                USER.IDENTIFIER.`as`("identifier"),
                USER.PASSWORD.`as`("password"),
                USER.ROLE.`as`("role"),
                USER.WITHDRAWN.`as`("withdrawn"),
                USER.CREATED_AT.`as`("created_at"),
                USER.UPDATED_AT.`as`("updated_at"),
            )
            .fetchInto(DBUser::class.java)
            .first()
    }
}