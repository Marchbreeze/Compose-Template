package com.march.domain.entity

data class AuthTokenModel(
    val accessToken: String,
    val refreshToken: String,
)
