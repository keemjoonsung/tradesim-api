package com.kjs990114.domain.user

import com.kjs990114.data.Audit
import com.kjs990114.data.Auditable
import com.kjs990114.data.PK
import com.kjs990114.domain.user.vo.Name
import com.kjs990114.domain.user.vo.PersonalInfo
//TODO() : 나중에 회원가입 약관, 가입 연령 등 제한사항이 들어가게 됨.
data class Trader(
    val userPK: PK,

    val personal: PersonalInfo,

    val deleted: Boolean = false,

    override val audit: Audit,
): Auditable {

    fun delete(): Trader {
        if(deleted) throw TraderErrors.ALREADY_DELETED.toException()

        return this.copy(deleted = true)
            .run { this.update() }
    }

    private fun update(): Trader {
        return this.copy(audit = this.audit.updated())
    }

    companion object {
        fun join(
            userPK: PK,

            name: String,
        ): Trader {
            return Trader(
                userPK = userPK,

                personal = PersonalInfo.from(
                    name = Name.of(name)
                ),

                audit = Audit.new(),
            )
        }
    }
}

interface TraderRepository {
    fun findBy(pk: PK): Trader?

    fun save(trader: Trader): Trader
    fun delete(pk: PK)
}