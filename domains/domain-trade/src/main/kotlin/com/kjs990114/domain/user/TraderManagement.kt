package com.kjs990114.domain.user

import com.kjs990114.data.PK

interface TraderManagement {
    fun join(trader: Trader): Trader
    fun modify(trader: Trader): Trader
    fun delete(pk: PK): Trader
}

class TraderService(
    private val repository: TraderRepository,
): TraderManagement {
    override fun join(trader: Trader): Trader {
        return repository.save(trader)
    }

    override fun modify(trader: Trader): Trader {
        TODO("Not yet implemented")
    }

    override fun delete(pk: PK): Trader {
        val stored = load(pk)
            .run { this.delete() }

        return repository.save(stored)
    }

    private fun load(pk: PK): Trader {
        return repository.findBy(pk) ?: throw TraderErrors.NOT_FOUND.toException()
    }
}