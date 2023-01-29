package com.example.flowex.usecase

import com.example.flowex.data.Data
import com.example.flowex.repository.remote.TrendingGifRepository
import javax.inject.Inject

class GetTrendingGifUseCaseImpl @Inject constructor(
    private val trendingGifRepository: TrendingGifRepository
) : GetTrendingGifUseCase {
    override suspend fun invoke(): Data {
        return trendingGifRepository.getTrendingGifs()
    }
}
