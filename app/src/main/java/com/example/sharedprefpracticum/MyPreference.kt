package com.example.sharedprefpracticum

import android.content.Context

class MyPreference(context : Context) {
    val PREFERENCE_NAME = "SharedPreference.Example"
    val PREFERENCE_LOGIN_COUNT = "LoginCount"
    val PREFERENCE_STRING_COUNT = "StringCount"
    val preference = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun getLoginCount() : Int {
        return preference.getInt(PREFERENCE_LOGIN_COUNT,0)
    }
    fun setLoginCount(count : Int) {
        val editor = preference.edit()
        editor.putInt(PREFERENCE_LOGIN_COUNT,count)
        editor.apply()
    }
    fun setString(word : String){
        val editor = preference.edit()
        editor.putString(PREFERENCE_STRING_COUNT,word)
        editor.apply()
    }
    fun getString() : String? {
        return preference.getString(PREFERENCE_STRING_COUNT, "")
    }
}