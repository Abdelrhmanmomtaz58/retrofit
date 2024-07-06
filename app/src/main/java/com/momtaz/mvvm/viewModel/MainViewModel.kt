package com.momtaz.mvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.momtaz.mvvm.model.JokeRespons
import com.momtaz.mvvm.network.API
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val joke = MutableLiveData<JokeRespons>()

    init {
        getRandomJoke()
    }

    private fun getRandomJoke() {
       viewModelScope.launch {
          joke.postValue( API.apiServes?.getRandomJoke() )
       }
    }

}