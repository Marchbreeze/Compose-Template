package com.march.data.service

import com.march.data.dto.AuthTokenDto
import com.march.data.dto.BaseResponse
import retrofit2.http.Header
import retrofit2.http.POST

interface AuthService {
    @POST("api/v1/auth/reissue")
    suspend fun postReissueTokens(
        @Header("Authorization") authorization: String
    ): BaseResponse<AuthTokenDto>
}
