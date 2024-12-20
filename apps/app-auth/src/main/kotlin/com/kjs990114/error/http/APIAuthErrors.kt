package com.kjs990114.error.http

import com.kjs990114.application.ApplicationException
import com.kjs990114.application.ErrorInfo
import org.springframework.http.HttpStatus
import java.lang.RuntimeException

interface APIAuthErrorInfo {
    val errors: List<ErrorInfo>
    val status: HttpStatus

    fun message(): String = "[${status.value()}] ${errors.joinToString(separator = "/n") { it.message() }}"
}

class APIAuthErrors(
    override val errors: List<ErrorInfo>
) : APIAuthErrorInfo {
    override val status = HttpStatus.UNAUTHORIZED
}

class APIAuthException private constructor(
    error: APIAuthErrors,
    cause: Throwable? = null
) : RuntimeException(error.message(), cause) {
    constructor(cause: ApplicationException): this(APIAuthErrors(cause.errors), cause)
}



