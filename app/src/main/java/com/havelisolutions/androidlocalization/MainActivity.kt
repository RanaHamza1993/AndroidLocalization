package com.havelisolutions.androidlocalization

import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yariksoffice.lingver.Lingver
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Lingver.getInstance().setLocale(this, CustomSharedPreference(this).getStringValue("language","en")!!)

        setContentView(R.layout.activity_main)

        chkbox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                CustomSharedPreference(applicationContext).setStringValue("language","ur")
                hello.setText("ہیلو")
            }
            else {
                CustomSharedPreference(applicationContext).setStringValue("language","en")

                hello.setText("Hello")
            }

        }
    }
//    override fun attachBaseContext(base: Context) {
//
////        super.attachBaseContext(RuntimeLocaleChanger.wrapContext(base))
//    }
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
//        RuntimeLocaleChanger.overrideLocale(this)
        Lingver.getInstance().setLocale(this, "en")

    }


}