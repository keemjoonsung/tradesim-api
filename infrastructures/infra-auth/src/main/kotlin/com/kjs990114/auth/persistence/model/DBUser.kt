package com.kjs990114.auth.persistence.model

import com.kjs990114.auth.domain.user.AuthUser
import com.kjs990114.auth.domain.user.vo.AuthRole
import com.kjs990114.auth.domain.user.vo.Identifier
import com.kjs990114.auth.domain.user.vo.Password
import com.kjs990114.auth.support.utils.PasswordEncoderImpl
import com.kjs990114.data.Audit
import com.kjs990114.data.PK
import java.time.LocalDateTime

data class DBUser(
    private val pk: Long,
    private val identifier: String,
    private val password: String,
    private val role: String,
    private val withdrawn: Boolean,
    private val createdAt: LocalDateTime,
    private val updatedAt: LocalDateTime,
) {
    fun toDomain(): AuthUser {
        return AuthUser(
            identifier = Identifier.of(identifier),
            password = Password.of(password,PasswordEncoderImpl()),
            role = AuthRole.of(role),
            audit = Audit.of(createdAt, updatedAt),
            withdrawn = withdrawn,
            pk = PK.of(pk),
        )
    }
}