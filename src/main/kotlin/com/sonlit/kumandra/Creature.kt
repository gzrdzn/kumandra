package com.sonlit.kumandra

abstract class Creature(
    val kind: String
){
    fun description() = println("This kind of creature is a $kind.")
}

class Animal(kind: String): Creature(kind)

class Human(): Creature(kind = "human")
