package com.example.jobintentservices

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class NormalService : Service(){

    override fun onCreate() {
        super.onCreate()
        Log.d("abc","onCreate:" +  Thread.currentThread().name)


    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("abc","onDestroy:" +  Thread.currentThread().name)

    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

}