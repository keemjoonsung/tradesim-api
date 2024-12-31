package com.kjs990114.auth.persistence.model

import com.kjs990114.auth.domain.user.BaseUser
import com.kjs990114.auth.domain.user.vo.Role
import com.kjs990114.auth.domain.user.vo.Identifier
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
    fun toDomain(): BaseUser {
        return BaseUser(
            identifier = Identifier.of(identifier),
            password = Password.from(password),
            role = Role.of(role),
            audit = Audit.of(createdAt, updatedAt),
            withdrawn = withdrawn,
            pk = PK.of(pk),
        )
    }
}