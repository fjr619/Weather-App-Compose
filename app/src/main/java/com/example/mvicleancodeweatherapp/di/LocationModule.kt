package com.example.mvicleancodeweatherapp.di

import com.example.mvicleancodeweatherapp.data.location.DefaultLocationTraker
import com.example.mvicleancodeweatherapp.domain.location.ILocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {

    @Binds
    @Singleton
    abstract fun bindLocationTracker(defaultLocationTracker: DefaultLocationTraker): ILocationTracker
}