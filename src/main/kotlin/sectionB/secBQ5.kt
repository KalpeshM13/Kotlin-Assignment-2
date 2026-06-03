package org.example.sectionB

//Create a class 'Employee' with a private salary. Add setter and getter functions with validation.

class Employee {

    private var salary: Double = 0.0

    fun setSalary(newSalary: Double) {
        if (newSalary >= 0) {
            salary = newSalary
        } else {
            println("Salary cannot be negative.")
        }
    }

    fun getSalary() {
        println("Salary: $salary")
    }
}

fun main() {
    val employee = Employee()

    employee.setSalary(50000.0)
    employee.getSalary()

    employee.setSalary(-1000.0)
    employee.getSalary()
}