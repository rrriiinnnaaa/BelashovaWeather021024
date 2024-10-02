package com.example.weather_app2.Adapters

import android.view.View
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class WeatherAdapter : ListAdapter<WeatherModel, > {

    class Holder(view: View) : RecyclerView.ViewHolder(view){
        fun bind(item: WeatherModel){

        }
    }
}