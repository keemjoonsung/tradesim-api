package com.kjs990114.auth.application.usecase.join

import com.kjs990114.application.Params
import com.kjs990114.application.UseCase
import com.kjs990114.auth.application.AuthInvalidParamErrors
import com.kjs990114.auth.domain.user.BaseUser
import com.kjs990114.auth.domain.user.BaseUserManagement
import com.kjs990114.auth.domain.user.vo.Role
import com.kjs990114.auth.domain.user.vo.Identifier
import com.kjs990114.auth.domain.user.vo.Password
import com.kjs990114.auth.support.utils.PasswordEncoder
import com.kjs990114.domain.user.Trader
import com.kjs990114.domain.user.TraderManagement
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class TraderJoinUseCase(
    private val userManagement: BaseUserManagement,
    private val traderManagement: TraderManagement,
    private val encoder: PasswordEncoder,
): UseCase<TraderJoinUseCase.Param, Unit> {
    data class Param(
        val email: String,
        val rawPassword: String,
        val name: String,
    ) : Params {
        override fun validate(): Boolean {

            if (email.isBlank()) throw AuthInvalidParamErrors.REQUIRED_IDENTIFIER.toException()
            if (Identifier.validate(email).not()) throw AuthInvalidParamErrors.INVALID_IDENTIFIER.toException()

            if (rawPassword.isBlank()) throw AuthInvalidParamErrors.REQUIRED_PASSWORD.toException()
            if (Password.validate(rawPassword).not()) throw AuthInvalidParamErrors.INVALID_PASSWORD.toException()


            return true
        }
    }

    @Transactional
    override fun execute(params: Param) {
        params.validate()

        buildBaseUser(params)
            .run { userManagement.register(this) }
            .run { buildTrader(params, this)}
            .run { traderManagement.join(this) }
    }

    private fun buildBaseUser(param: Param): BaseUser {
        return BaseUser.new(
            identifier = param.email,
            password = Password.of(param.rawPassword, encoder),
            role = Role.USER.name,
        )
    }

    private fun buildTrader(param: Param, user: BaseUser): Trader {
        return Trader.join(
            userPK = user.pk,
            name = param.name,
        )
    }
}