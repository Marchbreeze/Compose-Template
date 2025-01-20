package com.march.domain.repository

interface UserRepository {
    fun getAccessToken(): String

    fun getRefreshToken(): String

    fun getDeviceToken(): String

    fun setTokens(
        accessToken: String,
        refreshToken: String,
    )

    fun setDeviceToken(deviceToken: String)

    fun clearInfo()
}
