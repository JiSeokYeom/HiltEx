package com.example.flowex.module

import com.example.flowex.usecase.GetTrendingGifUseCase
import com.example.flowex.usecase.GetTrendingGifUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {

    @Binds
    @Singleton
    abstract fun provideGetTrendingGifUseCase(
        getTrendingGifUseCaseImpl: GetTrendingGifUseCaseImpl
    ): GetTrendingGifUseCase
}