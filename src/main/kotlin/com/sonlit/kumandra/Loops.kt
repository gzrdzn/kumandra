package com.sonlit.kumandra

class Loops {
    private val seasons = arrayOf("spring", "summer", "winter", "fall")
    
    fun printSeasons() {
        for (season in seasons) {
            println(season)
        }

        val notASeason = "whatever" !in seasons
        println(notASeason)
    }
}
