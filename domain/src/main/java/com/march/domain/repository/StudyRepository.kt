package com.march.domain.repository

import com.march.domain.entity.StudyModel

interface StudyRepository {
    suspend fun getHomeworks(
        page: Int,
        size: Int,
    ): Result<StudyModel>
}
