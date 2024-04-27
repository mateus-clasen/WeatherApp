package com.clasenmateus.weatherapp.domain.weather

import com.squareup.moshi.JsonClass
import java.time.LocalDateTime

/**
 * Created by Mateus H. Clasen on 21/04/2024.
 */
@JsonClass(generateAdapter = true)
data class WeatherData(
    val time: LocalDateTime? = null,
    val temperatureCelsius: Double? = null,
    val pressure: Double? = null,
    val windSpeed: Double? = null,
    val humidity: Double? = null,
    val weatherType: WeatherType? = null
)
