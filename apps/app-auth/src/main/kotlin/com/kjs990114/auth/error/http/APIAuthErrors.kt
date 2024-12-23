package com.kjs990114.auth.error.http

import com.kjs990114.application.error.ApplicationException
import com.kjs990114.domain.error.ErrorInfo
import org.springframework.http.HttpStatus

class APIAuthErrors(
    override val errors: List<ErrorInfo>,
    override val status: HttpStatus = HttpStatus.UNAUTHORIZED
) : APIErrors(errors,status)

class APIAuthException private constructor(
    override val error: APIAuthErrors,
    cause: Throwable? = null
) : APIException(error, cause) {
    constructor(cause: ApplicationException): this(APIAuthErrors(cause.errors), cause)
}