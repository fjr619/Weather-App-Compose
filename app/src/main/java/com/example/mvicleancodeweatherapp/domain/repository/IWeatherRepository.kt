package com.example.mvicleancodeweatherapp.domain.repository

import com.example.mvicleancodeweatherapp.domain.util.Resource
import com.example.mvicleancodeweatherapp.domain.weather.WeatherInfo

interface IWeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}