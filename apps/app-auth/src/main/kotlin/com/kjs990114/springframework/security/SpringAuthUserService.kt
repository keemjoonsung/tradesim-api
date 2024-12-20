package com.kjs990114.springframework.security

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class SpringAuthUser(
    private val user: AuthUser,
): UserDetails{
    fun getTokenUser() = user

    override fun getAuthorities() = user.roles.map { GrantedAuthority { it.name } }.toMutableSet()
    override fun getUsername() = user.identifier.value
    override fun getPassword() = user.password.value
}