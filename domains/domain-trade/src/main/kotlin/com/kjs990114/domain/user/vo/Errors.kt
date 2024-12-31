package com.kjs990114.domain.user.vo

import com.kjs990114.domain.error.InputErrorInfo

enum class VOErrors(
    override val desc: String,
    override val field: String,
): InputErrorInfo {
    INVALID_NAME("이름이 잘못 되었습니다","name"),
    ;

    override val code = this.name
}