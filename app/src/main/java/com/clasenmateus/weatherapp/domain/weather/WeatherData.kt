package com.clasenmateus.weatherapp.domain.weather

import java.time.LocalDateTime

/**
 * Created by Mateus H. Clasen on 21/04/2024.
 */
data class WeatherData(
    val time: LocalDateTime,
    val temperatureCelsius: Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double,
    val weatherType: WeatherType
)