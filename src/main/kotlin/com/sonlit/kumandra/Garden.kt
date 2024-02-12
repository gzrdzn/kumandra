package com.sonlit.kumandra

class Garden<T: Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
}

open class Flower

class Rose: Flower()

interface FlowerCare<T> {
    fun prune(flower: T)
}
