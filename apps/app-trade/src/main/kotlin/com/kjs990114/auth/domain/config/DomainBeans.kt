package com.kjs990114.auth.domain.config

import com.kjs990114.auth.domain.user.BaseUserRepository
import com.kjs990114.auth.domain.user.BaseUserManagement
import com.kjs990114.auth.domain.user.BaseUserService
import com.kjs990114.auth.support.utils.PasswordEncoder
import com.kjs990114.domain.user.TraderManagement
import com.kjs990114.domain.user.TraderRepository
import com.kjs990114.domain.user.TraderService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DomainBeans {
    @Bean
    fun userManagement(repository: BaseUserRepository, encoder: PasswordEncoder): BaseUserManagement = BaseUserService(repository, encoder)

    @Bean
    fun traderManagement(repository: TraderRepository): TraderManagement = TraderService(repository)
}