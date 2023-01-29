package com.example.flowex.module

import com.example.flowex.data.TrendingGifDataSource
import com.example.flowex.data.TrendingGifDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    @Singleton
    abstract fun provideTrendingGifDataSource(
        trendingGifDataSourceImpl: TrendingGifDataSourceImpl
    ): TrendingGifDataSource
}