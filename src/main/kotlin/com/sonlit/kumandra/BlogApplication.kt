package com.sonlit.kumandra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.math.BigDecimal

// TODO: commenting to finish Udemy's Kotlin tutorial first. Then, will finish Spring Boot Kotlin's tutorial.
//@SpringBootApplication
class BlogApplication

/**
 * TBC: https://disneypr.udemy.com/course/kotlin-for-java-developers/learn/lecture/7792822#overview
 */
val TOTAL_BOOKS_REFORMED_BIBLE = 66
val TOTAL_BOOKS_CATHOLIC_BIBLE = 73

fun main(args: Array<String>) {
//	runApplication<BlogApplication>(*args)
	println("Hello World!")
	
//	val bibleStudyLeader = Leader("abraham")
//	println(bibleStudyLeader.firstName)
//	bibleStudyLeader.topic = "Book of Genesis"
//	println(bibleStudyLeader.topic)
//	
//	val student1 = Student("Peter", "Jonah")
//	val student2 = Student("Andrew", "Jonah")
//	val student3 = Student("Philip", "Noah")
//	listOfStudents(student1, student2, student3)
//	val students = arrayOf(student1, student2, student3)
//	listOfStudents(*students)
//	
//	val lamb = Animal("lamb")
//	val lion = Animal("lion")
//	val human = Human("baby")
//	lamb.description()
//	lion.description()
//	human.description()
//	
//	val man = Man()
//	man.description()
//	println("Man is unique with his reproductive system: ${Man.REPRODUCTIVE_FUNCTION}")
//	val woman = Woman()
//	woman.description()
//	println("Man is unique with his reproductive system: ${Woman.REPRODUCTIVE_FUNCTION}")
//
//	SpaceSubmarine("underwater")
//	println(Earth.description())
//	
//	println("Total Continents: ${Continents.entries.size}")

	
	println("${LegalStatements.COPYRIGHT}")


	/**
	 * For Loop, Ranges
	 */
//	val range = 1..5
//	for (i in range){
//		println(i)
//	}
//	val charRange = 'a'..'z'
//	val strRange = "ABC".."XYZ"
//	print("3 in range: ")
//	println(3 in range)
//	print("'q' in charRange: ")
//	println('q' in charRange)
//	print("\"CCC\" in strRange: ")
//	println("CCC" in strRange)
//	print("\"CCCCCC\" in strRange: ")
//	println("CCCCCC" in strRange)
//	print("\"ZZ\" in strRange: ")
//	println("ZZ" in strRange)
//	val backwardRange = 5.downTo(1)
//	println(5 in backwardRange)
//	val reversedRange = range.reversed()
//	val stepRange = 3..15
//	val stepThree = stepRange.step(3)
//	println(stepThree)
//	for (num in 1..10 step 4) {
//		println("Step by 4 from 1 to 10: $num")
//	}
//	for (num in 5 downTo 1 step 2) {
//		println("Step by 2 from 5 to 1: $num")
//	}
//	for (i in 0 until 2) {
//		println("Search index until 2: $i")
//	}
//	val aString = "another string"
//	val stringRange = 0..aString.length

//	Loops().printSeasons()
	
//	println(AgeGroup().getNumber("a3"))

//	run { println("I'm in a lambda!") }
//	run(::sayHi)
//	Lambdas().getLamdda()
	//println(Lambdas().countToTenApply())
//	println("--------------------")
//	Lambdas().findByFirstName(students.toList(),"Peter")
//	Lambdas().findByFirstName(students.toList(),"one")
//	Lambdas().findByLastName(students.toList(), "Noah")
//	Lambdas().getAppliedString("small people")
	
	// Collections vs Sequences
	// println not executed until there's a terminal command which doesn't exist in sequence
	// but a terminal command exist in list.
	// Also, collections runs through every element, but sequence runs each element until condition or operation met.
//	listOf("John", "Mary", "Jude", "Paul", "Matthew").asSequence()
//		.map { println("mapping $it"); it.uppercase() }
//		.filter { println("filtering $it"); it[0] == 'J'}
//		//.toList() // uncomment to see printout.

//	GenericsLesson().printPriceList()
//	GenericsLesson().printProductList()
//	GenericsLesson().printActivities()
//	println()
//	MeasurementConverter().convertToInt(
//		listOf(1.5f, 35.2495, 9, -4.2, 2L)
//	)
	
	// Generics: Using Reified Parameters
	// a function that takes Any type, but returns values based on the declared parameter type
	val mixedList: List<Any> = listOf("a word", 1, BigDecimal(22.5), 'c', -2.4f, BigDecimal(-203.3434))
	// show only big decimals from list
	val bigDecimalsOnly = GenericsLesson().getElementsOfType<BigDecimal>(mixedList)
	for (item in bigDecimalsOnly) {
		println("big decimal: $item")
	}
	// show only strings from list
	val stringsOnly = GenericsLesson().getElementsOfType<String>(mixedList)
	for (item in stringsOnly) {
		println("string: $item")
	}
	
	// Contravariance
	val roseTender = object: FlowerCare<Rose> {
		override fun prune(flower: Rose) = println("I'm pruning a rose!")
	}
	val roseGarden = Garden<Rose>(listOf(Rose(), Rose()), roseTender)
}

fun sayHi() = println("just saying 'Hi'!")

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
