package com.sonlit.kumandra

object Earth {
    
    val planetPositionFromSun: Int = 3
    val planetColor: String = "blue"
    
    fun description() = "${javaClass.simpleName} is a beautiful $planetColor planet with living creatures."
}

enum class Continents(val hemisphere: String, val countries: Int) {
    AFRICA("Both", 54), 
    ANTARCTICA("Southern", 0), 
    ASIA("Both", 48), 
    AUSTRALIA("Southern", 14), 
    EUROPE("Northern", 44), 
    NORTH_AMERICA("Northern", 23), 
    SOUTH_AMERICA("Both", 12);
    
    fun total() = Continents.entries.size
}