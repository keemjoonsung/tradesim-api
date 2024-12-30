package com.kjs990114.auth.application

import com.kjs990114.application.error.ApplicationErrorInfo
import com.kjs990114.application.error.InvalidParamErrorInfo

enum class AuthApplicationErrors(
    override val desc: String,
): ApplicationErrorInfo {
    TOKEN_INVALID("토큰이 유효하지 않습니다."),
    FAILED_TO_GENERATE_TOKEN("토큰 생성에 실패하였습니다"),

    USER_NOT_MATCHED("아이디 혹은 비밀번호가 일치하지 않습니다"),
    ;

    override val code = this.name
}

enum class AuthInvalidParamErrors(
    override val desc: String,
    override val field: String,
): InvalidParamErrorInfo {
    REQUIRED_PASSWORD("비밀번호가 설정되지 않았습니다","password"),
    REQUIRED_IDENTIFIER("아이디가 설정되지 않았습니다", "identifier"),

    INVALID_PASSWORD("비밀번호 형식이 잘못되었습니다","password"),
    INVALID_IDENTIFIER("아이디 형식이 잘못되었습니다","identifier"),
    ;

    override val code = this.name
}
