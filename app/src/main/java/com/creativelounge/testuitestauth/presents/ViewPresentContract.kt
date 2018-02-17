package com.creativelounge.testuitestauth.presents

import com.creativelounge.testuitestauth.views.MvpView

interface ViewPresentContract {
    interface AuthContract{
        interface View : MvpView {
            // get text from field
            var username: String?
            var password: String?

            // show field with label
            fun showLoginScreen(labelResId: Int)
            fun showResultLoginScreen(labelResId: Int)

            fun focusFirst()

            // clear all fields
            fun clearAll()

            // show message to user
            fun showMessage(messageResId: Int)

            // go to next screen
            operator fun next()

            // close screen
            fun close()
        }

        interface Presenter : MvpPresenter<View> {
            fun onAuthClick()
        }
    }
}
