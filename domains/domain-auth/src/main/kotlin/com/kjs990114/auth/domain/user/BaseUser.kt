package com.kjs990114.auth.domain.user

import com.kjs990114.auth.domain.AuthErrors
import com.kjs990114.auth.support.utils.PasswordEncoder
import com.kjs990114.auth.domain.user.vo.Role
import com.kjs990114.auth.domain.user.vo.Identifier
import com.kjs990114.auth.domain.user.vo.Password
import com.kjs990114.data.Audit
import com.kjs990114.data.AuditableEntity
import com.kjs990114.data.PK

data class BaseUser(
    val identifier: Identifier,
    val password: Password,
    val role: Role,
    val withdrawn: Boolean,

    override val pk: PK,
    override val audit: Audit
): AuditableEntity {

    fun changeIdentifier(identifier: Identifier): BaseUser {
        if (this.identifier.value == identifier.value) throw AuthErrors.NOT_CHANGED.toException()

        return this.copy(identifier = identifier, audit = audit.updated())
    }

    fun changePassword(raw: String, encoder: PasswordEncoder): BaseUser {
        return this.copy(password = Password.of(raw, encoder), audit = audit.updated())
    }

    fun changeRole(role: Role): BaseUser {
        if (this.role == role) throw AuthErrors.NOT_CHANGED.toException()

        return this.copy(role = role, audit = audit.updated())
    }

    fun withdraw(): BaseUser {
        if (this.withdrawn) throw AuthErrors.ALREADY_WITHDRAWN.toException()

        return this.copy(withdrawn = true, audit = audit.updated())
    }

    companion object Factory {
        fun new(
            identifier: String,
            password: Password,
            role: String,
        ): BaseUser {
            return BaseUser(
                identifier = Identifier.of(identifier),
                password = password,
                role = Role.of(role),
                withdrawn = false,

                pk = PK.NULL,
                audit = Audit.new()
            )
        }
    }
}


interface BaseUserRepository {
    fun findBy(pk: PK): BaseUser?
    fun findById(identifier: Identifier): BaseUser?

    fun save(user: BaseUser): BaseUser
}


