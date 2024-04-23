package com.clasenmateus.weatherapp.di

import com.clasenmateus.weatherapp.data.location.DefaultLocationTracker
import com.clasenmateus.weatherapp.data.repository.WeatherRepositoryImpl
import com.clasenmateus.weatherapp.domain.location.LocationTracker
import com.clasenmateus.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Mateus H. Clasen on 22/04/2024.
 */

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}