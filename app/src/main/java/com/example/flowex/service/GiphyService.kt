package com.example.flowex.service

import com.example.flowex.BuildConfig
import com.example.flowex.data.Data
import retrofit2.http.GET
import retrofit2.http.Query

interface GiphyService {
    @GET("/v1/gifs/trending")
    suspend fun getTrendingGifs(
        @Query("api_key") apiKey : String = BuildConfig.API_KEY,
    ): Data
}