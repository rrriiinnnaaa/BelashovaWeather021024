package com.example.weather_app

import android.app.DownloadManager.Request
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.weather_app.databinding.ActivityMainBinding
import org.json.JSONObject

const val API_KEY = "d0bb1ced6a364bc3a5b35425242109"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bGet.setOnClickListener {
    getResult("Yakutsk")
        }
    }
    private fun getResult(name: String){
        val url = "https://api.weatherapi.com/v1/current.json"+
                "?key=$API_KEY&q=$name&aqi=no"
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(com.android.volley.Request.Method.GET, url, {
            response->
            val obj = JSONObject(response)
            val temp = obj.getJSONObject("current")
            Log.d("MyLog","Response: ${temp.getString("temp_c")}")
        }, {
            Log.d("MyLog","Volley error: $it")
        })
        queue.add(stringRequest)
    }
}