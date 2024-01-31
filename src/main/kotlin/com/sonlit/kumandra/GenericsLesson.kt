package com.sonlit.kumandra

import java.math.BigDecimal

class GenericsLesson {
    
    private val priceList = mutableListOf(
        BigDecimal(9.05),
        BigDecimal(101.32),
        BigDecimal(48.77)
    )

    fun printPriceList() {
        printElements(priceList)
    }
    
    private val productList = mutableListOf("shampoo", "conditioner", "gel")
    
    fun printProductList() {
        printElements(productList)
    }
        
    // function with generic type parameter
    private fun <T> printElements(list: List<T>) {
        for (e in list) {
            print("Element $e. ")
        }
    }
    
    fun printActivities() {
        listOf("dance", "soccer", "wrestle", "pottery", "spanish", "study", "piano", "game", "rest").printElementsWithSlashAfter()
    }
    
    // extension function using generics
    private fun <T> List<T>.printElementsWithSlashAfter() {
        for (e in this) {
            print("$e /")
        }
    }
}
