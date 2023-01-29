package com.example.flowex.module

import com.example.flowex.repository.remote.TrendingGifRepository
import com.example.flowex.repository.remote.TrendingGifRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun provideTrendingGifRepository(
        TrendingGifRepositoryImpl: TrendingGifRepositoryImpl
    ): TrendingGifRepository
}