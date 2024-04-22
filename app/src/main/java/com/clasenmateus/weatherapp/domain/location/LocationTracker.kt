package com.clasenmateus.weatherapp.domain.location

import android.location.Location

/**
 * Created by Mateus H. Clasen on 22/04/2024.
 */
interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}