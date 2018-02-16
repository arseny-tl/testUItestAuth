package com.creativelounge.testuitestauth.presents

import com.creativelounge.testuitestauth.views.MvpView

interface MvpPresenter<V : MvpView> {

    fun attachView(mvpView: V?)

    fun viewIsReady()

    fun detachView()

    fun destroy()
}
