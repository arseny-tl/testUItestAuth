package com.creativelounge.testuitestauth.data.remote

import com.creativelounge.testuitestauth.data.models.AuthData
import com.creativelounge.testuitestauth.data.models.AuthMessage
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {

    @POST("api/v1/auth")
    fun postAuth(@Body authData: AuthData): Call<AuthMessage>
}