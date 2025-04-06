package org.github.sleeknekro

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform