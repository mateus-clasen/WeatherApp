package com.clasenmateus.weatherapp.data.remote

import com.squareup.moshi.Json

/**
 * Created by Mateus H. Clasen on 21/04/2024.
 */
data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
