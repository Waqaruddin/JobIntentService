package com.example.jobintentservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val intent = Intent(this , MyJobIntentService::class.java )
        val intent = Intent(this , NormalService::class.java )

        startService(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}