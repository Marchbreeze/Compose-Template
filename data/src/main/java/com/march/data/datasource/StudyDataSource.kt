package com.march.data.datasource

import com.march.data.dto.BaseResponse
import com.march.data.dto.StudyDto

interface StudyDataSource {
    suspend fun getHomeworks(page: Int, size: Int): BaseResponse<StudyDto>
}
