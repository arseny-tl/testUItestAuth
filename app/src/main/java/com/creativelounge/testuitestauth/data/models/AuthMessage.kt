package com.creativelounge.testuitestauth.data.models

data class AuthMessage(
        val status: Boolean,
        val message: String,
        val token: String
)