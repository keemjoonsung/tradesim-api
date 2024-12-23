package com.kjs990114.auth.domain.user.vo

import com.kjs990114.auth.support.utils.PasswordEncoder

data class Password(
    val value: String, //암호화된 것
    private val raw: String? = null, // 원본
) {
    fun matches(password: Password): Boolean {
        return this.value == password.value
    }

    fun matches(raw: String, encoder: PasswordEncoder): Boolean {
        return encoder.matches(raw, value)
    }

    companion object {
        private const val MIN_LENGTH = 8
        private const val MAX_LENGTH = 16
        private val PATTERN = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$%^&*()])(?=\\S+\$).{$MIN_LENGTH,$MAX_LENGTH}\$".toRegex()

        fun validate(text: String): Boolean {
            return PATTERN.matches(text)
        }

        fun of(raw: String, encoder: PasswordEncoder): Password {
            // TODO
//            if(!validate(raw)) throw AuthInputErrors.INVALID_PASSWORD.toException()

            return Password(encoder.encode(raw), raw)
        }
    }
}