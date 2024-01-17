package com.sonlit.kumandra

import java.lang.NumberFormatException

class AgeGroup {
    
    fun getNumber(number: String): Int {
        return try {
            Integer.parseInt(number)
//        } catch (e: NumberFormatException) {
//            0
        } finally {
            println("AgeGroup is finished.")
        }
    }
}