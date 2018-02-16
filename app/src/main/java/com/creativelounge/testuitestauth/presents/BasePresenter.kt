package com.creativelounge.testuitestauth.presents

import com.creativelounge.testuitestauth.views.MvpView

abstract class BasePresenter<T : MvpView> : MvpPresenter<T>{
    private var view: T? = null

    @Override
    override fun attachView(mvpView: T?) {
        view = mvpView?: throw(Throwable("View doesn't exists)"))
    }

    override fun viewIsReady() {
    }

    open fun getView(): T = view?:throw(Throwable(""))

    @Override
    override fun detachView() {
        this.view = null
    }

    override fun destroy() {
    }
}