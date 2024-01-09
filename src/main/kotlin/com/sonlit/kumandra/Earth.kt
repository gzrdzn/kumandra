package com.sonlit.kumandra

object Earth {
    
    val planetPositionFromSun: Int = 3
    val planetColor: String = "blue"
    
    fun description() = "${javaClass.simpleName} is a beautiful $planetColor planet with living creatures."
}
