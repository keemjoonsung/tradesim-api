package com.kjs990114.data

import java.time.LocalDateTime

data class Audit(
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
) {
    fun updated(): Audit {
        return this.copy(updatedAt = LocalDateTime.now())
    }

    companion object {
        fun new(): Audit {
            return Audit(createdAt = LocalDateTime.now(), updatedAt = LocalDateTime.now())
        }
    }
}