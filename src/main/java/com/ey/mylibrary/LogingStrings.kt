package com.ey.mylibrary

import android.content.ContentValues.TAG
import android.util.Log

class LogingStrings {

    fun loginInternal(str1 :String, str2: String) {
        Log.d(TAG, str1 + str2)
        Log.d(TAG, "Hello from library")
    }


}