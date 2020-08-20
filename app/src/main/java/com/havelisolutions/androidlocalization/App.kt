package com.havelisolutions.androidlocalization

import android.app.Application
import android.content.Context
import com.yariksoffice.lingver.Lingver

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Lingver.init(this, CustomSharedPreference(this).getStringValue("language","en")!!)

    }
//    override fun attachBaseContext(base: Context) {
////        super.attachBaseContext(RuntimeLocaleChanger.wrapContext(base))
//
//    }
}