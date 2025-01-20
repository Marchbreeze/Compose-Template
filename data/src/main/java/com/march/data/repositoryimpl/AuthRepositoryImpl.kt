package com.march.data.repositoryimpl

import com.march.data.datasource.AuthDataSource
import com.march.domain.entity.AuthTokenModel
import com.march.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val authDataSource: AuthDataSource,
) : AuthRepository {
    override suspend fun reissueTokens(
        authorization: String,
    ): Result<AuthTokenModel> = runCatching {
        authDataSource.postReissueTokens(
            authorization,
        ).data.toModel()
    }
}
