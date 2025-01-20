package com.march.datastore.di

import android.content.Context
import android.content.SharedPreferences
import com.march.datastore.user.UserSharedPref
import com.march.datastore.user.UserSharedPrefImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SharedPrefModule {
    @Provides
    @Singleton
    fun provideSharedPreferences(
        @ApplicationContext context: Context,
    ): SharedPreferences = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)

    @Provides
    @Singleton
    fun provideSharedPref(sharedPrefImpl: UserSharedPrefImpl): UserSharedPref = sharedPrefImpl
}
