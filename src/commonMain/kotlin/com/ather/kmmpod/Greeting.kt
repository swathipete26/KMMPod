package com.ather.kmmpod

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}