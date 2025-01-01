package com.kjs990114.auth.persistence.user

import com.kjs990114.auth.domain.user.BaseUser
import com.kjs990114.auth.domain.user.BaseUserRepository
import com.kjs990114.auth.domain.user.vo.Identifier
import com.kjs990114.auth.persistence.model.DBUser
import com.kjs990114.data.PK
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class UserJooqRepository(
    private val dsl: DSLContext,
): BaseUserRepository, UserBaseJooq(dsl) {
    override fun findBy(pk: PK): BaseUser? {
        return baseSelect()
            .where(tUser.ID.equal(pk.getKey()))
            .fetchInto(DBUser::class.java)
            .map{ it.toDomain() }
            .firstOrNull()
    }

    override fun findById(identifier: Identifier): BaseUser? {
        return baseSelect()
            .where(tUser.IDENTIFIER.equal(identifier.value))
            .fetchInto(DBUser::class.java)
            .map { it.toDomain() }
            .firstOrNull()
    }

    override fun save(user: BaseUser): BaseUser {
        return saveUser(user)
    }

    override fun delete(pk: PK) {
        TODO("Not yet implemented")
    }

    private fun saveUser(user: BaseUser): BaseUser {
        return dsl
            .insertInto(tUser)
            .set(tUser.ID, user.pk.getOriginal())
            .set(tUser.IDENTIFIER, user.identifier.value)
            .set(tUser.PASSWORD, user.password.value)
            .set(tUser.ROLE, user.role.name)
            .set(tUser.WITHDRAWN, false)
            .set(tUser.CREATED_AT, user.audit.createdAt)
            .set(tUser.UPDATED_AT, user.audit.updatedAt)
            .onDuplicateKeyUpdate()
            .set(tUser.IDENTIFIER, user.identifier.value)
            .set(tUser.PASSWORD, user.password.value)
            .set(tUser.ROLE, user.role.name)
            .set(tUser.WITHDRAWN, user.withdrawn)
            .set(tUser.UPDATED_AT, user.audit.updatedAt)
            .returning(tUser.ID)
            .fetchOne { user.copy(pk = PK.from(it.id)) }!!
    }
}