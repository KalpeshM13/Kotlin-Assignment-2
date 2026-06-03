package org.example.sectionC

//Create a base class 'Person'. Derive 'Teacher' and 'Student' classes from it.

open class Person(val name: String, val age: Int) {
    fun displayPersonInfo() {
        println("Name: $name")
        println("Age: $age")
    }
}

class Teacher(name: String, age: Int, val subject: String) : Person(name, age) {
    fun displayTeacherInfo() {
        displayPersonInfo()
        println("Subject: $subject")
    }
}

class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    fun displayStudentInfo() {
        displayPersonInfo()
        println("Grade: $grade")
    }
}

fun main() {
    val teacher = Teacher("Navdeep", 35, "Mathematics")
    val student = Student("Kalpesh", 20, "A")

    println("\nTeacher Details:")
    teacher.displayTeacherInfo()

    println("\nStudent Details:")
    student.displayStudentInfo()
}