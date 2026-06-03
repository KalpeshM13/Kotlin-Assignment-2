package org.example.sectionA

//Create a class 'Rectangle' with length and breadth. Add a function area() to calculate area.

class Rectangle{
    var length: Double = 0.0
    var breadth: Double = 0.0

    fun area(): Double{
        return length * breadth
    }
}

fun main() {
    val rec = Rectangle()
    rec.length = 50.0
    rec.breadth = 7.0
    println("Area of rectangle with length ${rec.length} and breadth ${rec.breadth} is ${rec.area()}")
}