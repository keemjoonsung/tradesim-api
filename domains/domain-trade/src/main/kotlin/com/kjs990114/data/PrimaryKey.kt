package com.kjs990114.data

fun Long.toPK() = PrimaryKey.of(this)

typealias PK = PrimaryKey

data class PrimaryKey(
    private val value: Long? = null
) {
    companion object {
        val NULL = PrimaryKey()
        fun of(value: Long): PrimaryKey {
            return PrimaryKey(value)
        }

        fun from(value: Long?): PrimaryKey {
            return PrimaryKey(value)
        }
    }
}