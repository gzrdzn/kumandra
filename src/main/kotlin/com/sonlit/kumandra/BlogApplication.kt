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
	
	val bibleStudyLeader = Leader("abraham")
	println(bibleStudyLeader.firstName)
	bibleStudyLeader.topic = "Book of Genesis"
	println(bibleStudyLeader.topic)
	
	val student1 = Student("Peter", "Jonah")
	val student2 = Student("Andrew", "Jonah")
	val student3 = Student("Philip", "Noah")
	listOfStudents(student1, student2, student3)
	// Using spread operator
	// https://kotlinlang.org/docs/functions.html#variable-number-of-arguments-varargs
	// https://stackoverflow.com/questions/39389003/kotlin-asterisk-operator-before-variable-name-or-spread-operator-in-kotlin
	val students = arrayOf(student1, student2, student3)
	listOfStudents(*students)
	
	val lamb = Animal("lamb")
	val lion = Animal("lion")
	val human = Human()
	lamb.description()
	lion.description()
	human.description()
}

typealias dig = Set<Person>


fun listOfStudents(vararg students: Student) {
	for (student in students) {
		println("${student.id}: ${student.name}")
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
//			val name = EnglishUtility().capitalize(firstName)
			println("${firstName.capitalize()} is leading $field.")
			return field
		}
		set(value) {
			println("$firstName is updating topic to $value.")
			field = value
		}
}

fun String.capitalize(): String {
	return this.replaceFirstChar(Char::uppercase)
}
