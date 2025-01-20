package com.march.data.di

import com.march.data.datasource.AuthDataSource
import com.march.data.datasource.StudyDataSource
import com.march.data.datasourceimpl.AuthDataSourceImpl
import com.march.data.datasourceimpl.StudyDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    @Singleton
    fun provideAuthDataSource(authDataSourceImpl: AuthDataSourceImpl): AuthDataSource =
        authDataSourceImpl

    @Provides
    @Singleton
    fun provideStudyDataSource(studyDataSourceImpl: StudyDataSourceImpl): StudyDataSource =
        studyDataSourceImpl
}
