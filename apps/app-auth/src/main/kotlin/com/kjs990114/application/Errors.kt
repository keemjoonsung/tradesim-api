package com.kjs990114.application

import java.lang.RuntimeException

enum class AuthApplicationErrors(
    override val desc: String
) : ApplicationErrorInfo {
    TOKEN_INVALID("토큰이 유효하지 않습니다."),
    ;

    override val code = this.name
}


//TODO : domain-common/domain/error/DomainErrors.kt로 옮길 것
interface ErrorInfo {
    val code: String
    val desc: String

    fun message(): String {
        return "[$code] $desc"
    }

    fun toException(cause: Throwable?): BaseException {
        return when(cause) {
            is BaseException -> BaseException(listOf(this) + cause.errors, cause) // 여러개의 error 추가
            else -> BaseException(listOf(this), cause)
        }
    }

    fun toException(): BaseException {
        return toException(null)
    }
}
//TODO : domain-common/application/error/ApplicationErrors.kt로 옮길 것
open class ApplicationException(
    override val errors: List<ApplicationErrorInfo>,
    cause: Throwable? = null
) : BaseException(errors,cause) {
    constructor(error : ApplicationErrorInfo, cause: Throwable? = null): this(errors = listOf(error), cause = cause)
}

interface ApplicationErrorInfo: ErrorInfo {
    override fun toException(cause : Throwable?) = ApplicationException(this , cause)
    override fun toException() = toException(null)
}
//TODO : domain-common/DomainErrors.kt로 옮길 것
open class BaseException(
    open val errors: List<ErrorInfo>,
    cause: Throwable? = null
) : RuntimeException(errors.joinToString(separator = "\n") { it.message() }, cause)

