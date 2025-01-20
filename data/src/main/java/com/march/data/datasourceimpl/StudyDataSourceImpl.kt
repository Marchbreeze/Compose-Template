package com.march.data.datasourceimpl

import com.march.data.datasource.StudyDataSource
import com.march.data.dto.BaseResponse
import com.march.data.dto.StudyDto
import com.march.data.service.StudyService
import javax.inject.Inject

data class StudyDataSourceImpl @Inject constructor(
    private val studyService: StudyService,
) : StudyDataSource {
    override suspend fun getHomeworks(page: Int, size: Int): BaseResponse<StudyDto> =
        studyService.getHomeworks(page, size)
}
