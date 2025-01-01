package com.kjs990114.http.endpoint.auth.join

data class TraderJoinRequest(
    val email: String,
    val password: String,
    val name: String,
)