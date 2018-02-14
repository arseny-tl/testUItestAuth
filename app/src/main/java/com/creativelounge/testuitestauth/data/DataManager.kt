package com.creativelounge.testuitestauth.data

import com.creativelounge.testuitestauth.data.models.AuthData
import com.creativelounge.testuitestauth.data.models.AuthMessage
import com.creativelounge.testuitestauth.data.remote.AuthApi
import com.creativelounge.testuitestauth.util.PreferenceHelper
import com.creativelounge.testuitestauth.util.retrofitClient
import retrofit2.Call
import retrofit2.Retrofit

class DataManager {
    private val baseUrl: String = "hotsbuff.com:333"

    fun onLogin(username: String, password: String):Boolean{
        val apiService = retrofitClient.getClient(baseUrl).create(AuthApi::class.java)
        val authResponse = apiService.postAuth(AuthData(username, password)).execute()
        if(!authResponse.isSuccessful){
            return false
        }else
        {
            val authMessage = authResponse.body()
            PreferenceHelper!!.
        }

    }
}