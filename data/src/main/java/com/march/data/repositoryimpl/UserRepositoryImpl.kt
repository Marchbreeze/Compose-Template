package com.march.data.repositoryimpl

import com.march.datastore.user.UserSharedPref
import com.march.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl
@Inject
constructor(
    private val userSharedPref: UserSharedPref,
) : UserRepository {
    override fun getAccessToken(): String = userSharedPref.accessToken

    override fun getRefreshToken(): String = userSharedPref.refreshToken

    override fun getDeviceToken(): String = userSharedPref.deviceToken

    override fun setTokens(
        accessToken: String,
        refreshToken: String,
    ) {
        userSharedPref.accessToken = accessToken
        userSharedPref.refreshToken = refreshToken
    }

    override fun setDeviceToken(deviceToken: String) {
        userSharedPref.deviceToken = deviceToken
    }

    override fun clearInfo() {
        userSharedPref.clearInfo()
    }
}
