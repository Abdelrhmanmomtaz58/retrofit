package com.momtaz.mvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.momtaz.mvvm.viewModel.MainViewModel
import com.momtaz.mvvm.R
import com.momtaz.mvvm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
  private val viewModel : MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

    }
}