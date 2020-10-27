package com.example.wsr_khoroshilova

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    var retrofit : Retrofit? = null
    get() {
        if (field==null) { //проверяем равна ли переменная field нулю
            field=Retrofit.Builder()
                .baseUrl("https://api.icndb.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build() //если переменная field равна нулю, задаём ей другое значение
        }
        return field//возващаем значение field
    }
    fun instance() : PlaceHolderApi{
        return retrofit!!.create(PlaceHolderApi::class.java)
    }
}