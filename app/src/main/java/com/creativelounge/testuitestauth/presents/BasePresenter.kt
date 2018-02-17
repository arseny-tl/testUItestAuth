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

    open fun getView(): T = view?:throw(Throwable("Nothing to get"))

    @Override
    override fun detachView() {
        view = null
    }

    protected open fun isViewAttached(): Boolean = view == null

    @Override
    override fun destroy() {
    }
}