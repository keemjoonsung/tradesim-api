package com.kjs990114.http.endpoint.auth

import com.kjs990114.auth.application.usecase.login.LoginUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class AuthEndPoint(
    private val loginUseCase: LoginUseCase,
) {
    @PostMapping("/login")
    fun login(
        @RequestBody request: LoginRequest,
    ): TokenResponse {
        val param = LoginUseCase.Param(request.email, request.password)

        return loginUseCase.execute(param)
            .let { TokenResponse.from(it.tokenPair) }
    }
}