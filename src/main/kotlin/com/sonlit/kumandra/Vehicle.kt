package com.sonlit.kumandra

open class Vehicle {
    
    private val vehicleType: String
    
    constructor(vehicleType: String) {
        this.vehicleType = vehicleType
        println("Creating vehicle type: $vehicleType...")
    }
}

class SpaceSubmarine() : Vehicle(vehicleType = "SpaceSubmarine"), Spaceship {

    override val flyingAircraftName: String = "Archie"
    
    constructor(transportationMode: String) : this() {
        println("Initializing  transportation mode: $transportationMode...")
    }
    
    override fun drive(speed: Int): Boolean {
        return if (speed in 1..9 ) {
            println("${javaClass.simpleName} now driving at speed $speed.")
            true
        } else {
            println("${javaClass.simpleName} cannot drive at speed $speed.")
            false
        }
    }

    override fun powerOn(pilotName: String): String {
        println("Welcome to Kumandra, $pilotName! Let's go save the heart!")
        return "On!"
    }
}