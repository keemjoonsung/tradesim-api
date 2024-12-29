package com.kjs990114.auth.domain.user.service

import com.kjs990114.auth.domain.AuthErrors
import com.kjs990114.auth.domain.user.BaseUser
import com.kjs990114.auth.domain.user.AuthUserRepository
import com.kjs990114.auth.domain.user.vo.AuthRole
import com.kjs990114.auth.domain.user.vo.Identifier
import com.kjs990114.auth.support.utils.PasswordEncoder
import com.kjs990114.data.PK

interface BaseUserManagement {
    fun login(identifier: String, password: String): BaseUser
    fun logout(me: BaseUser): BaseUser

    fun register(new: BaseUser): BaseUser

    fun changeIdentifier(stored: BaseUser, new: Identifier): BaseUser
    fun changePassword(stored: BaseUser, newRaw: String, currentRaw: String): BaseUser
    fun changeRole(stored: BaseUser, new: AuthRole): BaseUser

    fun withdraw(me: BaseUser): BaseUser
    fun delete(pk: PK): BaseUser
}

class BaseUserService(
    private val repository: AuthUserRepository,
    private val encoder: PasswordEncoder,
): BaseUserManagement {
    override fun login(identifier: String, password: String): BaseUser {
        TODO("Not yet implemented")
    }

    override fun logout(me: BaseUser): BaseUser {
        TODO("Not yet implemented")
    }

    override fun register(new: BaseUser): BaseUser {
        checkExistsIdentifier(new.identifier)

        return repository.save(new)
    }

    override fun changeIdentifier(stored: BaseUser, new: Identifier): BaseUser {
        TODO("Not yet implemented")
    }

    override fun changePassword(stored: BaseUser, newRaw: String, currentRaw: String): BaseUser {
        TODO("Not yet implemented")
    }

    override fun changeRole(stored: BaseUser, new: AuthRole): BaseUser {
        TODO("Not yet implemented")
    }

    override fun withdraw(me: BaseUser): BaseUser {
        TODO("Not yet implemented")
    }

    override fun delete(pk: PK): BaseUser {
        TODO("Not yet implemented")
    }

    private fun checkExistsIdentifier(identifier: Identifier): Boolean{
        return repository.findById(identifier)?.let { throw AuthErrors.ALREADY_EXISTS_ID.toException() } ?: true
    }
}