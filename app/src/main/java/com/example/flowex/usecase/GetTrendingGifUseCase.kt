package com.example.flowex.usecase

import com.example.flowex.data.Data

interface GetTrendingGifUseCase {
    suspend operator fun invoke(): Data
}
