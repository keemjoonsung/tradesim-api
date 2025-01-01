package com.kjs990114.data

import java.time.LocalDateTime

data class Audit(
    val createdAt: LocalDateTime? = null,
    val updatedAt: LocalDateTime? = null,
) {
    fun updated(): Audit {
        return this.copy(updatedAt = LocalDateTime.now())
    }

    companion object {
        val NONE = Audit()

        fun new(): Audit {
            return Audit(createdAt = LocalDateTime.now(), updatedAt = LocalDateTime.now())
        }

        fun of(createdAt: LocalDateTime, updatedAt: LocalDateTime): Audit {
            return Audit(createdAt, updatedAt)
        }
    }
}