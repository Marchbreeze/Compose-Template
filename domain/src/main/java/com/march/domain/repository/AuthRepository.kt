package com.march.domain.repository

import com.march.domain.entity.AuthTokenModel

interface AuthRepository {
    suspend fun reissueTokens(
        authorization: String
    ): Result<AuthTokenModel>
}
