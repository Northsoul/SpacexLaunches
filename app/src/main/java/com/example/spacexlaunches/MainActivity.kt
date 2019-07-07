package com.example.spacexlaunches

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.R.attr.start
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(application, "{Your App Secret}", Analytics::class.java, Crashes::class.java)
    }
}
