package com.momtaz.mvvm.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object API {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://v2.jokeapi.dev/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiServes: JokeApiServes? = retrofit.create(JokeApiServes::class.java)
}