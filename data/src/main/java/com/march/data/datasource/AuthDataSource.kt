package com.march.data.datasource

import com.march.data.dto.AuthTokenDto
import com.march.data.dto.BaseResponse

interface AuthDataSource {
    suspend fun postReissueTokens(
        authorization: String,
    ): BaseResponse<AuthTokenDto>
}
