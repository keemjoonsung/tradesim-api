package com.kjs990114.auth.springframework.security

import com.kjs990114.auth.domain.user.BaseUser
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class SpringAuthUser(
    private val user: BaseUser,
): UserDetails{
    fun getTokenUser() = user

    override fun getAuthorities() = mutableSetOf(GrantedAuthority { PREFIX + user.role.name })
    override fun getUsername() = user.identifier.value
    override fun getPassword() = user.password.value

    companion object {
        private const val PREFIX = "ROLE_"
    }
}