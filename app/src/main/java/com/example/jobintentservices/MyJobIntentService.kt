package com.example.jobintentservices

import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class MyJobIntentService : JobIntentService(){

    override fun onCreate() {
        super.onCreate()
        Log.d("abc","onCreate:" +  Thread.currentThread().name)

    }
    override fun onHandleWork(intent: Intent) {


        Log.d("abc","onHandleWork:" +  Thread.currentThread().name)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}