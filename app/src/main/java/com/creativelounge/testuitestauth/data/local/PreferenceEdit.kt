package com.creativelounge.testuitestauth.data.local

import android.content.Context
import com.creativelounge.testuitestauth.util.PreferenceHelper
import com.creativelounge.testuitestauth.util.PreferenceHelper.get
import com.creativelounge.testuitestauth.util.PreferenceHelper.set

class PreferenceEdit(context: Context? = null, name: String? = null) {
    private var context: Context? = null

    init{
        this.context = context?:throw(Throwable("No context"))
    }

    fun setPref(key: String, value: String){
        val prefs = PreferenceHelper.defaultPrefs(context!!)
        prefs[key] = value
    }

    fun getPref(key: String, defaultValue: String?= null): String{
        val prefs = PreferenceHelper.defaultPrefs(context!!)
        return prefs["key", defaultValue]?:"404"
    }
}