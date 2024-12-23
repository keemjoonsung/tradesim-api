package com.kjs990114.auth.support.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Component

@Component
class PasswordEncoderImpl: PasswordEncoder {
    private val encoder = BCryptPasswordEncoder()

    override fun encode(raw: String): String {
        return encoder.encode(raw)
    }

    override fun matches(raw: String, encoded: String): Boolean {
        return encoder.matches(raw, encoded)
    }
}