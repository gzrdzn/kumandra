package com.sonlit.kumandra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// TODO: commenting to finish Udemy's Kotlin tutorial first. Then, will finish Spring Boot Kotlin's tutorial.
//@SpringBootApplication
class BlogApplication

/**
 * TBC: https://disneypr.udemy.com/course/kotlin-for-java-developers/learn/lecture/7792736#overview
 */
val TOTAL_BOOKS_REFORMED_BIBLE = 66
val TOTAL_BOOKS_CATHOLIC_BIBLE = 73

fun main(args: Array<String>) {
//	runApplication<BlogApplication>(*args)
	println("Hello World!")
	
	val bibleStudyLeader = Leader("Abraham")
	println(bibleStudyLeader.firstName)
	bibleStudyLeader.topic = "Book of Genesis"
	println(bibleStudyLeader.topic)
	
	val person1 = Person("1", "Peter", "Galilee")
	val person2 = Person("2", "Andrew", "Galilee")
	val person3 = Person("3", "Philip", "Jordan")
	listOfStudents(person1, person2, person3)
	// Using spread operator
	// https://kotlinlang.org/docs/functions.html#variable-number-of-arguments-varargs
	// https://stackoverflow.com/questions/39389003/kotlin-asterisk-operator-before-variable-name-or-spread-operator-in-kotlin
	val persons = arrayOf(person1, person2, person3)
	listOfStudents(*persons)
}

typealias dig = Set<Person>

open class Person(
	val id: String,
	val name: String,
	val from: String,
)

fun listOfStudents(vararg persons: Person) {
	for (person in persons) {
		println("${person.id}: ${person.name}")
	}
}

class Archaeologist(firstName: String, lastName: String, major: String?) {
	private val name: String
	
	constructor(firstName: String, lastName: String) : this(firstName, lastName, null)
	
	init {
		this.name = "$firstName $lastName"
	}
}

class Leader(val firstName: String, topic: String = "General") {
	
	var topic = topic 
		get() {
			println("$firstName is leading $field.")
			return field
		}
		set(value) {
			println("$firstName is updating topic to $value.")
			field = value
		}
}
