package com.example.wsr_khoroshilova


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PlaceHolderApi {
    @GET ("jokes/{id}")
    fun getJokeFrimItem(@Path("id")id: Int ) : Call<JokeGenerate>//отправляем запрос и возвращаем id шутки

}