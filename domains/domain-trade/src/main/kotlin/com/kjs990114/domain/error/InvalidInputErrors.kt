package com.kjs990114.domain.error

import com.kjs990114.domain.error.base.DomainException
import com.kjs990114.domain.error.base.ErrorInfo

interface InputErrorInfo: ErrorInfo {
    val field: String

    override fun message() = "${super.message()} ($field)"

    override fun toException(cause: Throwable?) = InvalidInputException(this, cause)
    override fun toException() = toException(null)
}

class InvalidInputException(
    override val errors: List<InputErrorInfo>,
    cause: Throwable? = null
): DomainException(errors, cause) {
    constructor(error: InputErrorInfo, cause: Throwable? = null): this(listOf(error), cause)
}