package com.example.mvicleancodeweatherapp.data.repository

import com.example.mvicleancodeweatherapp.data.mappers.toWeatherInfo
import com.example.mvicleancodeweatherapp.data.remote.WeatherApi
import com.example.mvicleancodeweatherapp.domain.repository.IWeatherRepository
import com.example.mvicleancodeweatherapp.domain.util.Resource
import com.example.mvicleancodeweatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): IWeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}