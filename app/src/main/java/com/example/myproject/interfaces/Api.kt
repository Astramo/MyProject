package com.example.myproject.interfaces

import com.example.myproject.models.server_side.ServerModel
import io.reactivex.Single
import retrofit2.http.GET


interface Api {
    @GET("task/menu.json")
    fun getData(): Single<List<ServerModel>>
}