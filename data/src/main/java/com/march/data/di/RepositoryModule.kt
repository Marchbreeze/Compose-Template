package com.march.data.di

import com.march.data.repositoryimpl.AuthRepositoryImpl
import com.march.data.repositoryimpl.StudyRepositoryImpl
import com.march.data.repositoryimpl.UserRepositoryImpl
import com.march.domain.repository.AuthRepository
import com.march.domain.repository.StudyRepository
import com.march.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideAuthRepository(authRepositoryImpl: AuthRepositoryImpl): AuthRepository =
        authRepositoryImpl

    @Provides
    @Singleton
    fun provideStudyRepository(studyRepositoryImpl: StudyRepositoryImpl): StudyRepository =
        studyRepositoryImpl

    @Provides
    @Singleton
    fun provideUserRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository =
        userRepositoryImpl
}
