package com.example.kmm_app

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}