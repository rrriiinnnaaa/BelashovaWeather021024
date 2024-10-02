package com.example.weather_app2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weather_app2.Adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataString = MutableLiveData<List<WeatherModel>>()

}