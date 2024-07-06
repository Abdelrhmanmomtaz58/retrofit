package com.momtaz.mvvm.model

import com.momtaz.mvvm.network.API

class JokeRepository {
    suspend fun getRandomJoke() = API.apiServes?.getRandomJoke()
}