package com.kjs990114.auth.domain.config

import com.kjs990114.auth.domain.user.BaseUserRepository
import com.kjs990114.auth.domain.user.BaseUserManagement
import com.kjs990114.auth.domain.user.BaseUserService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DomainBeans {
    @Bean
    fun userManagement(repository: BaseUserRepository): BaseUserManagement = BaseUserService(repository)
}