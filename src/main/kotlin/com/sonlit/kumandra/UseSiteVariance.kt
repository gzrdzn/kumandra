package com.sonlit.kumandra

open class Car {
}

class Toyota: Car() {
    
}

class Ford: Car() {
    
}

fun runCars() {
    val cars1990 = mutableListOf(Car(), Car())
    val cars2025 = mutableListOf<Car>()
    copyCars(cars1990, cars2025)

    val fords1990 = mutableListOf(Ford(), Ford())
    val fords2025 = mutableListOf<Ford>()
    copyCars(fords1990, fords2025)
    
    // This doesn't work because the destination requires a Ford type and we have given a Car type during copy cars.
    copyCars(fords1990, cars2025)
}

fun <T> copyCars(source: MutableList<T>, destination: MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}
