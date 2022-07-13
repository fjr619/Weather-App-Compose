package com.example.mvicleancodeweatherapp.domain.location

import android.location.Location

interface ILocationTracker {
    suspend fun getCurrentLocation(): Location?
}