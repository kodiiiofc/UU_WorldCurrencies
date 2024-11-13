package com.kodiiiofc.urbanuniversity.worldcurrencies.di

import com.kodiiiofc.urbanuniversity.worldcurrencies.data.CurrencyRepositoryImplementation
import com.kodiiiofc.urbanuniversity.worldcurrencies.domain.CurrencyModel
import com.kodiiiofc.urbanuniversity.worldcurrencies.domain.CurrencyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideCurrencyRepository() : CurrencyRepository {
        return CurrencyRepositoryImplementation()
    }

}