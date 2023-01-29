package com.example.flowex.data

interface TrendingGifDataSource {
    suspend fun getGifData(): Data
}
