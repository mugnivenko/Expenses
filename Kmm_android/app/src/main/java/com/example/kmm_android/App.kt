package com.example.kmm_android

import android.app.Application
import io.flutter.embedding.engine.loader.FlutterLoader
import android.util.Log
import com.example.kmm_app.Platform

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        FlutterLoader().startInitialization(this)
        Log.d("tag1", Platform().platform)
    }
}