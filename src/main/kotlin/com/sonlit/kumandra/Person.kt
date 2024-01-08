package com.sonlit.kumandra

open class Person(
    val id: String,
    open val firstName: String,
    open val lastName: String,
    val from: String,
) {
    open val name = "$firstName + $lastName"
}

class Student(
    override val firstName: String,
    override val lastName: String,
): Person("#", firstName,lastName, "Earth") {
    override val name = super.name
}

class Teacher: Person {

    constructor(
        firstName: String,
        lastName: String,
    ): super("",firstName,lastName, "Earth")
}
