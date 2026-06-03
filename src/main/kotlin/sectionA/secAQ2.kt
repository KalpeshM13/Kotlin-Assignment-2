package org.example.sectionA

//Create a class 'Student' with name and roll number. Add a function introduce() that prints student details.

class Student(name:String, rollNumber: Int){
    var name: String = ""
    var rollNumber: Int = 0

    init {
        this.name = name
        this.rollNumber = rollNumber
    }
    fun introduce() {
        println("Hello Everyone, I am $name.")
        println("My Roll Number is $rollNumber.")
    }
}

fun main() {
    val student = Student("Kalpesh", 110)
    student.introduce()
}