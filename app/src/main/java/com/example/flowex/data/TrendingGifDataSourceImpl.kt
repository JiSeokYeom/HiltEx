package com.example.flowex.data

import com.example.flowex.service.GiphyService
import javax.inject.Inject

class TrendingGifDataSourceImpl @Inject constructor(
    private val giphyService: GiphyService
) : TrendingGifDataSource {
    override suspend fun getGifData(): Data = giphyService.getTrendingGifs()
}
