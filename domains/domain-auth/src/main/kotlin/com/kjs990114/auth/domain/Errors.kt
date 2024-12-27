package com.kjs990114.auth.domain

import com.kjs990114.domain.error.ErrorInfo

enum class AuthErrors(
    override val desc: String,
): ErrorInfo{
    NOT_FOUND("유저를 찾을 수 없습니다"),

    ALREADY_WITHDRAWN("이미 회원탈퇴를 한 유저입니다"),

    NOT_MATCHED_PASSWORD("패스워드가 일치하지 않습니다"),
    INVALID_PASSWORD("패스워드의 형식이 올바르지 않습니다"),

    NOT_CHANGED("유저 정보가 변경되지 않았습니다."),
    ;

    override val code = this.name
}


