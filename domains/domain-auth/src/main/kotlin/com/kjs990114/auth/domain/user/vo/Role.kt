package com.kjs990114.auth.domain.user.vo

import java.lang.IllegalArgumentException

enum class Role {
    ADMIN,
    USER,
    ;

    companion object {
        fun of(value: String): Role {
            return entries.find { it.name == value.uppercase() } ?: throw IllegalArgumentException("Unknown AuthRole: $value")
        }
    }
}