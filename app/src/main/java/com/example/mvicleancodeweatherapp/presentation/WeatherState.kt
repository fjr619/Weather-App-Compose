package com.example.mvicleancodeweatherapp.presentation

import com.example.mvicleancodeweatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)