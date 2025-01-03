package com.kjs990114.auth.domain

import com.kjs990114.domain.error.InputErrorInfo
import com.kjs990114.domain.error.base.ErrorInfo

enum class AuthErrors(
    override val desc: String,
): ErrorInfo {
    NOT_FOUND("유저를 찾을 수 없습니다"),

    ALREADY_WITHDRAWN("이미 회원탈퇴를 한 유저입니다"),
    ALREADY_EXISTS_ID("이미 존재하는 아이디 입니다"),

    NOT_MATCHED_PASSWORD("패스워드가 일치하지 않습니다"),

    NOT_CHANGED("유저 정보가 변경되지 않았습니다."),
    ;

    override val code = this.name
}

enum class AuthInputErrors(
    override val desc: String,
    override val field: String,
): InputErrorInfo {
    REQUIRED_IDENTIFIER("아이디가 입력되지 않았습니다", "identifier"),
    REQUIRED_PASSWORD("패스워드가 입력되지 않았습니다", "password"),

    INVALID_IDENTIFIER("아이디의 형식이 올바르지 않습니다", "identifier"),
    INVALID_PASSWORD("패스워드의 형식이 올바르지 않습니다", "password"),
    ;

    override val code = this.name
}