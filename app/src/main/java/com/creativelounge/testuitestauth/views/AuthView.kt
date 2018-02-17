package com.creativelounge.testuitestauth.views

import android.os.Bundle
import com.creativelounge.testuitestauth.presents.ViewPresentContract
import android.support.v7.app.AppCompatActivity

class AuthView : AppCompatActivity(), ViewPresentContract.AuthContract.View{
    override var username: String? = null
    override var password: String? = null

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @Override
    override fun onDestroy() {
        super.onDestroy()
    }

    override fun showLoginScreen(labelResId: Int) {
    }

    override fun showResultLoginScreen(labelResId: Int) {
    }

    override fun focusFirst() {
    }

    override fun clearAll() {
    }

    override fun showMessage(messageResId: Int) {
    }

    override fun next() {
    }

    override fun close() {
    }
}
