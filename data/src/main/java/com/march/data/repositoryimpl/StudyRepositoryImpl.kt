package com.march.data.repositoryimpl

import com.march.data.datasource.StudyDataSource
import com.march.domain.entity.StudyModel
import com.march.domain.repository.StudyRepository
import javax.inject.Inject

class StudyRepositoryImpl @Inject constructor(
    private val studyDataSource: StudyDataSource,
) : StudyRepository {
    override suspend fun getHomeworks(page: Int, size: Int): Result<StudyModel> = runCatching {
        studyDataSource.getHomeworks(page, size).data.toModel()
    }
}
