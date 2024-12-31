package com.kjs990114.domain.user.vo

data class PersonalInfo(
    val name: Name,
) {
    companion object {
        fun from(name: Name): PersonalInfo {
            return PersonalInfo(name)
        }
    }
}

data class Name(
    val value: String
) {
    companion object {
        private val PATTERN = "".toRegex()

        fun validate(value: String): Boolean {
            return true
        }

        fun of(value: String): Name {
            if(!validate(value)) throw VOErrors.INVALID_NAME.toException()

            return Name(value)
        }
    }
}
