package com.example.flowex.repository.remote

import com.example.flowex.data.Data
import com.example.flowex.data.TrendingGifDataSource
import javax.inject.Inject

class TrendingGifRepositoryImpl @Inject constructor(
    private val trendingGifDataSource: TrendingGifDataSource
): TrendingGifRepository {
    override suspend fun getTrendingGifs(): Data = trendingGifDataSource.getGifData()
}
