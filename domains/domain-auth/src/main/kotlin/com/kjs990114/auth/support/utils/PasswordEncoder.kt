package com.kjs990114.auth.support.utils

interface PasswordEncoder {
    fun encode(raw: String): String
    fun matches(raw: String, encoded: String): Boolean
}