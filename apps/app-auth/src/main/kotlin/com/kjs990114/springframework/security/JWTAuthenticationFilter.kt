package com.kjs990114.springframework.security

import com.kjs990114.error.http.APIAuthException
import com.kjs990114.application.AuthApplicationErrors
import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.http.HttpHeaders
import org.springframework.web.filter.OncePerRequestFilter

class JWTAuthenticationFilter(
    private val tokenManager: TokenManagement, //TODO -> domain-auth의 TokenManagement 인터페이스
) : OncePerRequestFilter() {
    override fun doFilterInternal(request: HttpServletRequest, response: HttpServletResponse, filterChain: FilterChain) {
        if (ignoreURI(request)) {
            filterChain.doFilter(request, response)
            return
        }

        val token = extractAccessToken(request)

        val user = tokenToUser(token)
            ?.also { setAuthentication(it) }

        filterChain.doFilter(request, response)
    }

    private fun tokenToUser(token: String): SpringAuthUser {
        val user = runCatching { tokenManager.validate(token) }
            .getOrElse { throw APIAuthException(AuthApplicationErrors.TOKEN_INVALID.toException()) }

        return SpringAuthUser(user)
    }

    companion object {
        private val IGNORE_URLS = listOf(
            "/api/auth/login",
        )

        private fun ignoreURI(request: HttpServletRequest) : Boolean {
            return IGNORE_URLS.any { request.requestURI.startsWith(it) }
        }

        private const val BEARER = "Bearer "

        private fun extractAccessToken(request: HttpServletRequest) : String {
            return request.getHeader(HttpHeaders.AUTHORIZATION).removePrefix(BEARER)
        }
    }



}