package com.kjs990114.application.error

import com.kjs990114.domain.error.DomainException
import com.kjs990114.domain.error.ErrorInfo

open class ApplicationException(
    override val errors: List<ApplicationErrorInfo>,
    cause: Throwable? = null
) : DomainException(errors,cause) {
    constructor(error : ApplicationErrorInfo, cause: Throwable? = null): this(errors = listOf(error), cause = cause)
}

interface ApplicationErrorInfo: ErrorInfo {
    override fun toException(cause : Throwable?) = ApplicationException(this , cause)
    override fun toException() = toException(null)
}