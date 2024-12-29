package com.kjs990114.data

fun Long.toPK() = PrimaryKey.of(this)

typealias PK = PrimaryKey

data class PrimaryKey(
    private val value: Long? = null
) {
    fun getKey(): Long {
        return this.value ?: throw IllegalStateException("PK is null")
    }

    fun getOriginal(): Long? {
        return this.value
    }

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