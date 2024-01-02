package com.sonlit.kumandra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// TODO: commenting to finish Udemy's Kotlin tutorial first. Then, will finish Spring Boot Kotlin's tutorial.
//@SpringBootApplication
class BlogApplication

/**
 * TBC: https://disneypr.udemy.com/course/kotlin-for-java-developers/learn/lecture/7792736#overview
 */
fun main(args: Array<String>) {
//	runApplication<BlogApplication>(*args)
	println("Hello World!")
}

typealias dig = Set<Person>

open class Person(
	val id: String,
	val name: String,
	val from: String,
)

class Archaeologist(firstName: String, lastName: String, major: String?) {
	private val name: String
	
	constructor(firstName: String, lastName: String) : this(firstName, lastName, null)
	
	init {
		this.name = "$firstName $lastName"
	}
}

