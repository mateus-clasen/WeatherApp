package com.clasenmateus.weatherapp.data.repository

import com.clasenmateus.weatherapp.data.mappers.toWeatherInfo
import com.clasenmateus.weatherapp.data.remote.WeatherApi
import com.clasenmateus.weatherapp.domain.repository.WeatherRepository
import com.clasenmateus.weatherapp.domain.util.Resource
import com.clasenmateus.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

/**
 * Created by Mateus H. Clasen on 22/04/2024.
 */
class WeatherRepositoryImpl @Inject constructor(
        private val api: WeatherApi
        ): WeatherRepository {
            override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
                return try {
                    Resource.Success(
                        data = api.getWeatherData(
                            lat = lat,
                            long = long
                        ).toWeatherInfo()
                    )
                } catch (e: Exception) {
                    e.printStackTrace()
                    Resource.Error(e.message ?: "Um erro desconhecido ocorreu")
                }
            }

}