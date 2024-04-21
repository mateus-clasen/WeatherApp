package com.clasenmateus.weatherapp.domain.weather

/**
 * Created by Mateus H. Clasen on 21/04/2024.
 */
data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
