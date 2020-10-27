package com.example.wsr_khoroshilova

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    var jokeList = mutableListOf<JokeGenerate>()
    lateinit var retrofit : PlaceHolderApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retrofit= RetrofitClient.instance()

       var id = 0
        findViewById<Button>(R.id.button).setOnClickListener {
            retrofit.getJokeFrimItem(id).enqueue(object :  Callback<JokeGenerate> { //при нажатии на кнопку button отправить запрос на сайт и вернуть тип и значение шутки
                override fun onFailure(call: Call<JokeGenerate>, t: Throwable) {
                 Log.d("RETROFIT", t.message)
                }

                override fun onResponse(
                    call: Call<JokeGenerate>,
                    response: Response<JokeGenerate>
                ) {
                    jokeList.add(response.body()!!)
                }
            })


            id++
        }
    }

        fun nextActivity() {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

}}

