package org.example.sectionD

//Create an interface 'Shape' with function area(). Implement it in Circle and Rectangle classes.

interface Shape{
    fun area()
}

class Rectangle(): Shape{
    var length : Int = 0
    var breadth: Int = 0

    override fun area() {
        println("Area of rectangle: ${length*breadth}")
    }
}

class Circle(): Shape{
    var radius : Int = 0

    override fun area() {
        println("Area of circle: ${Math.PI*radius*radius}")
    }
}

fun main() {
    val rect = Rectangle()
    rect.length = 15
    rect.breadth = 9
    rect.area()

    val circle = Circle()
    circle.radius = 20
    circle.area()
}