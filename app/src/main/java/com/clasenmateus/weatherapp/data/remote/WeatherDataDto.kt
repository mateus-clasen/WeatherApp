package com.clasenmateus.weatherapp.data.remote
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by Mateus H. Clasen on 21/04/2024.
 */
@JsonClass(generateAdapter = true)
data class WeatherDataDto(
    val time: List<String>? = null,
    @field:Json(name = "temperature_2m")
    val temperatures: List<Double>? = null,
    @field:Json(name = "weathercode")
    val weatherCodes: List<Int>? = null,
    @field:Json(name = "pressure_msl")
    val pressures: List<Double>? = null,
    @field:Json(name = "windspeed_10m")
    val windSpeeds: List<Double>? = null,
    @field:Json(name = "relativehumidity_2m")
    val humidities: List<Double>? = null
)
