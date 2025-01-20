package com.march.data.datasourceimpl

import com.march.data.datasource.AuthDataSource
import com.march.data.dto.AuthTokenDto
import com.march.data.dto.BaseResponse
import com.march.data.service.AuthService
import javax.inject.Inject

data class AuthDataSourceImpl
@Inject
constructor(
    private val authService: AuthService,
) : AuthDataSource {
    override suspend fun postReissueTokens(
        authorization: String,
    ): BaseResponse<AuthTokenDto> = authService.postReissueTokens(authorization)
}
