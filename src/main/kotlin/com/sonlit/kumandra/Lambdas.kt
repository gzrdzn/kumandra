package com.sonlit.kumandra

class Lambdas {
    
    fun getLamdda() {
        
        val student1 = Student("one", "student")
        val student2 = Student("two", "student")
        val student3 = Student("three", "student")
        val student4 = Student("four", "student")
        
        val students = listOf(student1, student2, student3, student4)
        
        println("students: ${ students.map { s -> s.firstName } }")
        println("students: ${ students.map (Student::firstName) }")
    }

    //fun countToTen(): String {
//	val numbers = StringBuilder()
//	for (i in 1..10) {
//		numbers.append(i).append(",")
//	}
//	return numbers.toString().dropLast(1)
//}

    /** Lambdas With Receivers */
    fun countToTen(): String {
        val numbers = StringBuilder()
        // with() converts the passed-in Instance into a Receiver.
        // inside the lambda, we don't need to explicitly reference the Receiver
        // since the Receiver is "this".
        return with(numbers) {
            for (i in 1..10) {
                append(i).append(",")
            }
            toString().dropLast(1)
        }
    }
}