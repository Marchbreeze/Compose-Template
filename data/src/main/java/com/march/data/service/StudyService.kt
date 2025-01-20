package com.march.data.service

import com.march.data.dto.BaseResponse
import com.march.data.dto.StudyDto
import retrofit2.http.GET
import retrofit2.http.Query

interface StudyService {
    @GET("api/v1/homeworks")
    suspend fun getHomeworks(
        @Query("page")
        page: Int,
        @Query("size")
        size: Int,
    ): BaseResponse<StudyDto>
}
