package com.kjs990114.auth.springframework.config

import com.kjs990114.auth.domain.token.TokenManagement
import com.kjs990114.auth.springframework.security.JWTAuthenticationFilter
import com.kjs990114.auth.support.utils.PasswordEncoder
import com.kjs990114.auth.support.utils.PasswordEncoderImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter

@Configuration
class SecurityConfig(
    private val tokenProvider: TokenManagement
) {
    @Bean
    fun passwordEncoder(): PasswordEncoder = PasswordEncoderImpl()

    @Bean
    fun configure(): WebSecurityCustomizer {
        return WebSecurityCustomizer {
            it.ignoring().requestMatchers(*IGNORE_URLS)
        }
    }

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        return http
            .csrf { it.disable() }
            .formLogin { it.disable() }
            .sessionManagement { it.sessionCreationPolicy(SessionCreationPolicy.STATELESS) }
            .authorizeHttpRequests {
                it.anyRequest().authenticated()
            }
            .addFilterBefore(JWTAuthenticationFilter(tokenProvider), UsernamePasswordAuthenticationFilter::class.java)
            .build()
    }

    companion object {
        private val IGNORE_URLS = arrayOf(
            "/api/auth/login",
            "/api/auth/refresh",

            "/api/auth/join",
            "/api/auth/find-identifier",

            "/error",
        )
    }
}