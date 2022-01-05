package com.example.kmm_app

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

fun hello(): String = "Hello from ${Platform.()}"