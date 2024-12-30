package com.kjs990114.auth.application.usecase

import com.kjs990114.application.Params
import com.kjs990114.application.UseCase
import com.kjs990114.auth.application.AuthInvalidParamErrors
import com.kjs990114.auth.domain.user.BaseUser
import com.kjs990114.auth.domain.user.BaseUserManagement
import com.kjs990114.auth.domain.user.vo.AuthRole
import com.kjs990114.auth.domain.user.vo.Identifier
import com.kjs990114.auth.domain.user.vo.Password
import com.kjs990114.auth.support.utils.PasswordEncoder
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class UserJoinUseCase(
    private val userManagement: BaseUserManagement,
    private val encoder: PasswordEncoder,
): UseCase<UserJoinUseCase.Param, Unit> {
    data class Param(
        val request: UserJoinRequest,
    ) : Params {
        override fun validate(): Boolean {
            with(request) {
                if (email.isBlank()) throw AuthInvalidParamErrors.REQUIRED_IDENTIFIER.toException()
                if (Identifier.validate(email).not()) throw AuthInvalidParamErrors.INVALID_IDENTIFIER.toException()

                if (password.isBlank()) throw AuthInvalidParamErrors.REQUIRED_PASSWORD.toException()
                if (Password.validate(password).not()) throw AuthInvalidParamErrors.INVALID_PASSWORD.toException()
            }

            return true
        }
    }

    data class UserJoinRequest(
        val email: String,
        val password: String,
    )

    @Transactional
    override fun execute(params: Param) {
        params.validate()
        println(buildBaseUser(params))
        return buildBaseUser(params)
            .run { userManagement.register(this) }
    }

    private fun buildBaseUser(param: Param): BaseUser {
        return BaseUser.new(
            identifier = param.request.email,
            password = Password.of(param.request.password, encoder),
            role = AuthRole.USER.name,
        )
    }
}