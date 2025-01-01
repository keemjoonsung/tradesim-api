package com.kjs990114.persistence.model

import com.kjs990114.data.Audit
import com.kjs990114.data.PK
import com.kjs990114.domain.user.Trader
import com.kjs990114.domain.user.vo.Name
import com.kjs990114.domain.user.vo.PersonalInfo
import java.time.LocalDateTime

data class DBTrader(
    val userPK: Long,
    val name: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
) {
    fun toDomain(): Trader {
        return Trader(
            userPK = PK.of(userPK),
            personal = PersonalInfo.from(Name.of(name)),
            audit = Audit.of(createdAt, updatedAt),
        )
    }
}