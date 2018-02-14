package com.creativelounge.testuitestauth.util

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

object retrofitClient {
    //next: сделать клиент такой, чтобы просто вызывать объект клиента и передавать в него апи
    fun getClient(url: String): Retrofit = Retrofit.Builder()
                                           .baseUrl("https://api.github.com/")
                                           .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                                           .addConverterFactory(MoshiConverterFactory.create())
                                           .build()
}