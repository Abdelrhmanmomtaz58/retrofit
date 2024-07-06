package com.momtaz.mvvm.network

import com.momtaz.mvvm.model.JokeRespons
import retrofit2.http.GET

interface JokeApiServes {
    @GET("joke/Any")
    suspend fun getRandomJoke(): JokeRespons
}