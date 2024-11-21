package org.ilyneh.kaishen

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform