package com.clasenmateus.weatherapp.domain.repository

import com.clasenmateus.weatherapp.domain.util.Resource
import com.clasenmateus.weatherapp.domain.weather.WeatherInfo

/**
 * Created by Mateus H. Clasen on 22/04/2024.
 */
interface WeatherRepository {
suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}
