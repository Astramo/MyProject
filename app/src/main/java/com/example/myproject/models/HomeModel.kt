package com.example.myproject.models

import com.example.myproject.models.server_side.ServerModel
import io.reactivex.Single

class HomeModel {
    private val apiClass: ApiClass = ApiClass()

    fun getData(): Single<List<ServerModel>> = apiClass.getApis().getData()
}