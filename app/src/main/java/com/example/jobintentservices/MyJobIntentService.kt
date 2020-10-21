package com.example.jobintentservices

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class MyJobIntentService : JobIntentService() {

    //Static
    companion object {
        val JOB_ID = 1000
        fun enqueueWork(context: Context, work: Intent) {
            enqueueWork(context, MyJobIntentService::class.java, JOB_ID, work)
        }
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("abc", "onCreate:" + Thread.currentThread().name)

    }

    override fun onHandleWork(intent: Intent) {


        Log.d("abc", "onHandleWork:" + Thread.currentThread().name)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("abc", "onDestroy:" + Thread.currentThread().name)

    }
}