package com.havelisolutions.androidlocalization

import android.content.Context

class CustomSharedPreference   constructor(private val context: Context){
    val PREFS_NAME = "myPreference"
    //val  Country_CODE = "countryCode"

    fun setStringValue(strKey:String?, strValue:String?){
        val sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString(strKey, strValue)
        editor.apply()
    }
    fun getStringValue(strKey:String?,defaultValue:String?=null):String?{
        val sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val value=sharedPreferences.getString(strKey,defaultValue)
        return value
    }
    fun setIntValue(strKey:String?, intValue:Int){
        val sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putInt(strKey, intValue)
        editor.apply()
    }
    fun getIntValue(strKey:String):Int?{
        val sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val value=sharedPreferences.getInt(strKey,0)
        return value
    }
    fun setBooleanValue(strKey:String, boolValue:Boolean){
        val sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean(strKey, boolValue)
        editor.apply()
    }
    fun getBooleanValue(strKey:String?):Boolean?{
        val sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val value=sharedPreferences.getBoolean(strKey,false)
        return value
    }


}