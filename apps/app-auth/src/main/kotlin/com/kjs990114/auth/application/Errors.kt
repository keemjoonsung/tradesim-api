package com.kjs990114.auth.application

import com.kjs990114.application.error.ApplicationErrorInfo

enum class AuthApplicationErrors(
    override val desc: String
) : ApplicationErrorInfo {
    TOKEN_INVALID("토큰이 유효하지 않습니다."),
    ;

    override val code = this.name
}
