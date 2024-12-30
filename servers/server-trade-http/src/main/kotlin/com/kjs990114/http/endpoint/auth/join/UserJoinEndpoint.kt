package com.kjs990114.http.endpoint.auth.join

import com.kjs990114.auth.application.usecase.UserJoinUseCase
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class UserJoinEndpoint(
    private val joinUseCase: UserJoinUseCase
) {

    @PostMapping("/join")
    @ResponseStatus(HttpStatus.CREATED)
    fun join(
        @RequestBody request: UserJoinUseCase.UserJoinRequest,
    ) {
        val param = UserJoinUseCase.Param(request)

        joinUseCase.execute(param)
    }
}