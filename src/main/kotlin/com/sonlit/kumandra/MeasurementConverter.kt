package com.sonlit.kumandra

/**
 * A converter for all types of measurements.
 */
class MeasurementConverter {
    
    fun <T: Number> convertToInt(list: List<T>) {
        println("Converting numbers to integers...")
        for (num in list) {
            println("${num.toInt()}")
        }
    }
    
    fun convertToFirstDigit(collection: List<Number>) {
        for (num in collection) {
            println(num.toInt())
        }
    }
}