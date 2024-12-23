package com.kjs990114.auth.domain.user

import com.kjs990114.auth.support.utils.PasswordEncoder
import com.kjs990114.auth.domain.user.vo.AuthRole
import com.kjs990114.auth.domain.user.vo.Identifier
import com.kjs990114.auth.domain.user.vo.Password
import com.kjs990114.data.Audit
import com.kjs990114.data.AuditableEntity
import com.kjs990114.data.PK

data class AuthUser(
    val identifier: Identifier,
    val password: Password,
    val role: AuthRole,
    val withdrawn: Boolean,

    override val pk: PK,
    override val audit: Audit
): AuditableEntity {

    fun changeIdentifier(identifier: Identifier): AuthUser {
        if (this.identifier.value == identifier.value) throw AuthErrors.NOT_CHANGED.toException()

        return this.copy(identifier = identifier, audit = audit.updated())
    }

    fun changePassword(raw: String, encoder: PasswordEncoder): AuthUser {
        return this.copy(password = Password.of(raw, encoder), audit = audit.updated())
    }

    fun changeRole(role: AuthRole): AuthUser {
        if (this.role == role) throw AuthErrors.NOT_CHANGED.toException()

        return this.copy(role = role, audit = audit.updated())
    }

    fun withdraw(): AuthUser {
        if (this.withdrawn) throw AuthErrors.ALREADY_WITHDRAWN.toException()

        return this.copy(withdrawn = true, audit = audit.updated())
    }

    companion object Factory {
        fun new(
            identifier: String,
            password: Password,
            role: String,
        ): AuthUser {
            return AuthUser(
                identifier = Identifier.of(identifier),
                password = password,
                role = AuthRole.of(role),
                withdrawn = false,

                pk = PK.NULL,
                audit = Audit.new()
            )
        }
    }
}


interface AuthUserRepository {
    fun findBy(pk: PK): AuthUser?
    fun findById(identifier: Identifier): AuthUser?

    fun save(user: AuthUser): AuthUser
}


