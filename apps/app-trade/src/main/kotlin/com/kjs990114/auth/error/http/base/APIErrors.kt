package com.kjs990114.auth.error.http.base

import com.kjs990114.domain.error.base.DomainException
import com.kjs990114.domain.error.base.ErrorInfo
import org.springframework.http.HttpStatus
import java.lang.RuntimeException

class APIException(
    error: APIErrors,
    cause: Throwable? = null,
): RuntimeException(error.message(), cause){
    constructor(cause: DomainException, status: HttpStatus = HttpStatus.INTERNAL_SERVER_ERROR): this(APIErrors(cause.errors, status))
}

class APIErrors(
    private val errors: List<ErrorInfo>,
    private val status: HttpStatus,
){
    fun message(): String = "[${status.value()}] ${errors.joinToString(separator = "/n") { it.message() }}"
}
