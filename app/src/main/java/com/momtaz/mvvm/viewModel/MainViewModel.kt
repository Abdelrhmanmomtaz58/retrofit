package com.momtaz.mvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.momtaz.mvvm.model.JokeRepository
import com.momtaz.mvvm.model.JokeRespons
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val repository = JokeRepository()
    val joke = MutableLiveData<JokeRespons>()

    init {
        getRandomJoke()
    }

    private fun getRandomJoke() {
       viewModelScope.launch {
          joke.postValue( repository.getRandomJoke())
       }
    }

}