package com.kjs990114.auth.persistence.model

import com.kjs990114.auth.domain.user.AuthUser
import com.kjs990114.auth.domain.user.vo.AuthRole
import com.kjs990114.auth.domain.user.vo.Identifier
import com.kjs990114.auth.domain.user.vo.Password
import com.kjs990114.data.Audit
import com.kjs990114.data.PK
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "auth_user")
data class AuthUserEntity(
    @Id
    private val id: Long? = null,

    private val identifier: String,
    private val password: String,
    private val role: AuthRole,

    private val createdAt: LocalDateTime,
    private val updatedAt: LocalDateTime,
    private val withdrawn: Boolean = false,
    ) {
    fun toDomain(): AuthUser {
        return AuthUser(
            identifier = Identifier.of(this.identifier),
            password = Password.from(this.password),
            role = this.role,
            withdrawn = this.withdrawn,
            audit = Audit(createdAt,updatedAt),
            pk = PK.from(this.id),
        )
    }

    companion object {
        fun from(user: AuthUser): AuthUserEntity {
            return AuthUserEntity(
                identifier = user.identifier.value,
                password = user.password.value,
                role = user.role,
                createdAt = user.audit.createdAt,
                updatedAt = user.audit.updatedAt,
            )
        }
    }
}