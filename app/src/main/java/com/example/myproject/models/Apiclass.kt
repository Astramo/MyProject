package com.example.myproject.models

import com.example.myproject.interfaces.Api
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiClass {

    private val serverAddress: String = "https://cdn.opeqe.com"


    fun getApis(): Api {
        return Retrofit.Builder()
            .baseUrl(serverAddress)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build().create(Api::class.java);
    }


}