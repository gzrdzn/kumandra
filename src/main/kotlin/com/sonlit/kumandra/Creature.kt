package com.sonlit.kumandra

abstract class Creature(
    val kind: String
){
    open fun description() = println("This kind of creature is a $kind.")
}

class Animal(kind: String): Creature(kind)

class Human: Creature(kind = "human") {
    override fun description() = println("This kind of creature is a $kind and is created in the image of God.")
}
