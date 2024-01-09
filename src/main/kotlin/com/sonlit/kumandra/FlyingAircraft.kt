package com.sonlit.kumandra

import java.time.LocalDate

interface FlyingAircraft {
    
    val flyingAircraftName: String
    val creationDate: LocalDate
        get() = LocalDate.now()
        
    fun powerOn(pilotName: String): String
}

interface Spaceship: FlyingAircraft {
    fun drive(speed: Int): Boolean
}
