package com.clasenmateus.weatherapp.presentation

import com.clasenmateus.weatherapp.domain.weather.WeatherInfo

/**
 * Created by Mateus H. Clasen on 22/04/2024.
 */
data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
