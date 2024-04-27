package com.clasenmateus.weatherapp.data.mappers

import com.clasenmateus.weatherapp.data.remote.WeatherDataDto
import com.clasenmateus.weatherapp.data.remote.WeatherDto
import com.clasenmateus.weatherapp.domain.weather.WeatherData
import com.clasenmateus.weatherapp.domain.weather.WeatherInfo
import com.clasenmateus.weatherapp.domain.weather.WeatherType
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Created by Mateus H. Clasen on 21/04/2024.
 */
private data class IndexedWeatherData(
    val index: Int,
    val data: WeatherData
)


fun WeatherDataDto.toWeatherDataMap(): Map<Int, List<WeatherData>> {
    return time?.mapIndexed { index, time ->
        val temperature = temperatures?.get(index)
        val weatherCode = weatherCodes?.get(index)
        val pressure = pressures?.get(index)
        val windSpeed = windSpeeds?.get(index)
        val humidity = humidities?.get(index)
        IndexedWeatherData(
            index = index,
            data= WeatherData(
                time = LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME),
                temperatureCelsius = temperature,
                pressure = pressure,
                windSpeed = windSpeed,
                humidity = humidity,
                weatherType = weatherCode?.let { WeatherType.fromWMO(it) }
            )
        )
    }?.groupBy {
        it.index / 24
    }?.mapValues {
        it.value.map { it.data }
    } ?: emptyMap()
}

fun WeatherDto.toWeatherInfo(): WeatherInfo {
    val weatherDataMap = weatherData.toWeatherDataMap()
    val now = LocalDateTime.now()
    val currentWeatherData = weatherDataMap[0]?.find {
        val hour = if(now.minute < 30) now.hour else now.hour + 1
        it.time?.hour == hour
    }
    return WeatherInfo(
        weatherDataPerDay = weatherDataMap,
        currentWeatherData = currentWeatherData
    )
}