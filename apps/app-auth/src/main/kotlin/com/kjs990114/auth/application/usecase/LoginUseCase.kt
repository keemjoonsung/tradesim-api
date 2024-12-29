package com.kjs990114.auth.application.usecase

import com.kjs990114.application.Params
import com.kjs990114.application.UseCase
import com.kjs990114.auth.application.AuthApplicationErrors
import com.kjs990114.auth.domain.AuthInputErrors
import com.kjs990114.auth.domain.token.TokenManagement
import com.kjs990114.auth.domain.token.TokenPair
import com.kjs990114.auth.domain.user.BaseUser
import com.kjs990114.auth.domain.user.vo.Password
import com.kjs990114.auth.support.utils.PasswordEncoderImpl
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class LoginUseCase(
    private val tokenManagement: TokenManagement
) : UseCase<LoginUseCase.Param,LoginUseCase.Result>{
    data class Param(
        val identifier: String,
        val rawPassword: String,
    ): Params {
        override fun validate(): Boolean {
            if(identifier.isBlank()) throw AuthInputErrors.REQUIRED_IDENTIFIER.toException()

            return true
        }
    }

    data class Result(
        val tokenPair: TokenPair
    )

    @Transactional(readOnly = true)
    override fun execute(params: Param): Result {
        params.validate()

        return login(params)
            .run { generateToken(this) }
            .let {Result(it)}
    }

    private fun login(param: Param): BaseUser {
        //TODO()
//        return runCatching { authManagement.login(param.identifier, param.rawPassword)}
//            .getOrElse { throw AuthApplicationErrors.USER_NOT_MATCHED.toException() }

        return BaseUser.new("kjs990114@naver.com", Password.of("trade1234!",PasswordEncoderImpl()), "USER")
    }

    private fun generateToken(user: BaseUser): TokenPair {
        return runCatching { tokenManagement.generate(user) }
            .getOrElse { throw AuthApplicationErrors.FAILED_TO_GENERATE_TOKEN.toException() }
    }

}