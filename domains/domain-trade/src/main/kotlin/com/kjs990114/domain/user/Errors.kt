package com.kjs990114.domain.user

import com.kjs990114.domain.error.base.ErrorInfo

enum class TraderErrors(
    override val desc: String,
): ErrorInfo {
    NOT_FOUND("존재하지 않는 유저입니다"),

    ALREADY_DELETED("이미 삭제된 유저입니다"),
    ;

    override val code = this.name
}