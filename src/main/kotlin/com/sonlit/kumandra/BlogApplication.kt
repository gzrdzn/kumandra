package com.sonlit.kumandra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// TODO: commenting to finish Udemy's Kotlin tutorial first. Then, will finish Spring Boot Kotlin's tutorial.
//@SpringBootApplication
class BlogApplication

/**
 * TBC: https://disneypr.udemy.com/course/kotlin-for-java-developers/learn/lecture/7792752#overview
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
	val students = arrayOf(student1, student2, student3)
	listOfStudents(*students)
	
	val lamb = Animal("lamb")
	val lion = Animal("lion")
	val human = Human("baby")
	lamb.description()
	lion.description()
	human.description()
	
	val man = Man()
	man.description()
	println("Man is unique with his reproductive system: ${Man.REPRODUCTIVE_FUNCTION}")
	val woman = Woman()
	woman.description()
	println("Man is unique with his reproductive system: ${Woman.REPRODUCTIVE_FUNCTION}")

	SpaceSubmarine("underwater")
	println(Earth.description())
	
	println("Total Continents: ${Continents.entries.size}")

	
	println("${LegalStatements.COPYRIGHT}")


	/**
	 * For Loop, Ranges
	 */
	val range = 1..5
	val charRange = 'a'..'z'
	val stringRange = "ABC".."XYZ"
	print("3 in range: ")
	println(3 in range)
	print("'q' in charRange: ")
	println('q' in charRange)
	print("\"CCC\" in stringRange: ")
	println("CCC" in stringRange)
	print("\"CCCCCC\" in stringRange: ")
	println("CCCCCC" in stringRange)
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
