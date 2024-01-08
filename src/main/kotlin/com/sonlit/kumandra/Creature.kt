package com.sonlit.kumandra

abstract class Creature(
    val kind: String
){
    abstract fun birthDate(): Int
    open fun description() = println("This kind of creature is a $kind.")
}

class Animal(kind: String): Creature(kind) {
    override fun birthDate(): Int = 18000101
}

class Human: Creature(kind = "human") {
    override fun birthDate(): Int = 19000101
    override fun description() = println("This kind of creature is a $kind and is created in the image of God.")
}
