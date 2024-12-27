package com.kjs990114.auth.domain.user.vo

data class Identifier(
    val value: String,
){
    companion object {
        private val PATTERN = "^[A-Za-z0-9+_.-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+\$".toRegex()

        fun validate(text: String): Boolean {
            return PATTERN.matches(text)
        }

        fun of(value: String): Identifier {
            //TODO
//            if (!validate(value)) throw AuthInputErrors.INVALID_IDENTIFIER.toException()

            return Identifier(value)
        }
    }
}