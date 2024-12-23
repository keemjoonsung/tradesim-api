package com.kjs990114.auth.error.http

import com.kjs990114.domain.error.ErrorInfo
import org.springframework.http.HttpStatus
import java.lang.RuntimeException

open class APIException(
    open val error: APIErrors,
    cause: Throwable? = null,
): RuntimeException(error.message(), cause)

open class APIErrors(
    open val errors: List<ErrorInfo>,
    open val status: HttpStatus,
){
    fun message(): String = "[${status.value()}] ${errors.joinToString(separator = "/n") { it.message() }}"
}
