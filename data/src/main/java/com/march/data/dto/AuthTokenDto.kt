package com.march.data.dto

import com.march.domain.entity.AuthTokenModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AuthTokenDto(
    @SerialName("accessToken")
    val accessToken: String,
    @SerialName("refreshToken")
    val refreshToken: String
) {
    fun toModel() =
        AuthTokenModel(accessToken = accessToken, refreshToken = refreshToken)
}
