package com.example.flowex.repository.remote

import com.example.flowex.data.Data

interface TrendingGifRepository {
    suspend fun getTrendingGifs(): Data
}
