package com.clasenmateus.weatherapp.data.remote

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by Mateus H. Clasen on 21/04/2024.
 */
//@JsonClass(generateAdapter = true)
data class WeatherDto(
    @field:Json(name= "hourly")
    val weatherData: WeatherDataDto
)
