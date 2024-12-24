package com.kjs990114.domain.error.base

import java.lang.RuntimeException

interface ErrorInfo {
    val code: String
    val desc: String

    fun message(): String {
        return "[$code] $desc"
    }

    fun toException(cause: Throwable?): DomainException {
        return when(cause) {
            is DomainException -> DomainException(listOf(this) + cause.errors, cause) // 여러개의 error 추가
            else -> DomainException(listOf(this), cause)
        }
    }

    fun toException(): DomainException {
        return toException(null)
    }
}

open class DomainException(
    open val errors: List<ErrorInfo>,
    cause: Throwable? = null
) : RuntimeException(errors.joinToString(separator = "\n") { it.message() }, cause)
