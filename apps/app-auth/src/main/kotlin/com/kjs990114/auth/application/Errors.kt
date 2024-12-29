package com.kjs990114.auth.application

import com.kjs990114.application.error.ApplicationErrorInfo

enum class AuthApplicationErrors(
    override val desc: String
) : ApplicationErrorInfo {
    TOKEN_INVALID("토큰이 유효하지 않습니다."),
    FAILED_TO_GENERATE_TOKEN("토큰 생성에 실패하였습니다"),

    USER_NOT_MATCHED("아이디 혹은 비밀번호가 일치하지 않습니다"),
    ;

    override val code = this.name
}
