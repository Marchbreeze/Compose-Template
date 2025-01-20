package com.march.datastore.user

interface UserSharedPref {
    var accessToken: String
    var refreshToken: String
    var deviceToken: String

    fun clearInfo()
}
