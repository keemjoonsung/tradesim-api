package com.kjs990114.auth.domain.user.vo

import java.lang.IllegalArgumentException

enum class AuthRole {
    ADMIN,
    USER,
    ;

    companion object {
        fun of(value: String): AuthRole {
            return entries.find { it.name == value.uppercase() } ?: throw IllegalArgumentException("Unknown AuthRole: $value")
        }
    }
}