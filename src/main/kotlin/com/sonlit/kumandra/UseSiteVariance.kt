package com.sonlit.kumandra

open class Car

class Toyota: Car()

class Ford: Car()

fun runCars() {
    val cars1990 = mutableListOf(Car(), Car())
    val cars2025 = mutableListOf<Car>()
    copyCars(cars1990, cars2025)

    val fords1990 = mutableListOf(Ford(), Ford())
    val fords2025 = mutableListOf<Ford>()
    copyCars(fords1990, fords2025)
    
    // Since making the method declaration with a source param that writes out as a Type of the destination, this works.
    copyCars(fords1990, cars2025)
}

fun <T> copyCars(source: MutableList<out T>, destination: MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}
