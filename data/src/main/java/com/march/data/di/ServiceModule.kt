package com.march.data.di

import com.march.data.service.AuthService
import com.march.data.service.StudyService
import com.march.network.RetrofitQualifier
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {
    @Provides
    @Singleton
    fun provideAuthService(
        @RetrofitQualifier.NOTOKEN retrofit: Retrofit,
    ): AuthService = retrofit.create(AuthService::class.java)

    @Provides
    @Singleton
    fun provideStudyService(
        @RetrofitQualifier.JWT retrofit: Retrofit,
    ): StudyService = retrofit.create(StudyService::class.java)
}
