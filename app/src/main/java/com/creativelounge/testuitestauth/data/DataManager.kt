package com.creativelounge.testuitestauth.data

import com.creativelounge.testuitestauth.data.models.AuthData
import com.creativelounge.testuitestauth.data.models.AuthMessage
import com.creativelounge.testuitestauth.data.remote.AuthApi
import com.creativelounge.testuitestauth.util.PreferenceHelper
import com.creativelounge.testuitestauth.util.retrofitClient

class DataManager {
    private val baseUrl: String = "hotsbuff.com:333"

    fun onLogin(username: String, password: String):Boolean{
        val apiService = retrofitClient.getClient(baseUrl).create(AuthApi::class.java)
        val authResponse = apiService.postAuth(AuthData(username, password)).execute()
        if(!authResponse.isSuccessful){
            throw(Throwable("Server error"))
        }else
        {
            val authMessage: AuthMessage = authResponse.body()?: throw(Throwable("Server error"))
            when(authMessage.status){
                false -> throw(Throwable("Auth failed"))
                true ->{
                    //перенести токен в настройки
                    return true
                }
            }
        }
    }

}
