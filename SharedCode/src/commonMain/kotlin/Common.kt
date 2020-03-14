package com.jetbrains.handson.mpp.mobile

expect fun platformName(): String

fun createApplicationScreenName(): String {
    return "Kotlin Rocks on ${platformName()}"
}