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

    fun findByFirstName(students: List<Student>, firstName: String) {
        students.forEach returnBlock@ { student ->
            if (student.firstName == firstName) {
                println("Yes, there's a student with first name $firstName.")
                return@returnBlock // local return, returning from the lambda instead of function
            } else {
                println("No, there is no $firstName.")
            }
        }
    }

    fun findByLastName(students: List<Student>, lastName: String) {
        return students.forEach { student ->
            if (student.lastName == lastName) {
                println("Yes, there's a student with last name $lastName.")
            } else {
                println("No, there is no $lastName.")
            }
        }
    }
    
    fun countToTen(): String {
        val numbers = StringBuilder()
        for (i in 1..10) {
            numbers.append(i).append(",")
        }
        return numbers.toString().dropLast(1)
    }

    /** Lambdas With Receivers */
    fun countToTenReceiver(): String =
        // with() converts the passed-in Instance into a Receiver.
        // inside the lambda, we don't need to explicitly reference the Receiver
        // since the Receiver is "this".
        with(StringBuilder()) {
            for (i in 1..10) {
                append(i).append(",")
            }
            toString().dropLast(1)
        }
    
    /** 'apply' always returns the Receiver object. 
     * we don't pass an instance to apply
     * but, we use an instance to apply a lambda 
     * which returns the Receiver object.
     */
    fun countToTenApply(): String =
        StringBuilder().apply() {
            for (i in 1..10) {
                append(i).append(",")
            }
        }.toString().dropLast(1)
}
