package org.example.sectionE

//Create a base class 'Shape' with function area(). Override it in Circle and Rectangle. Store objects in a list of Shape and call area() for each.

open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(private var radius: Double): Shape() {
    override fun area(): Double {
        return (Math.PI*radius*radius)
    }
}

class Rectangle(private var length: Double, private var breadth: Double): Shape() {
    override fun area(): Double {
        return (length*breadth)
    }
}

fun main() {
    val shapes = listOf<Shape>(
        Rectangle(20.0,8.0),
        Rectangle(3.0,8.0),
        Circle(3.0),
        Circle(5.0)
    )

    for (shape in shapes) {
        println("Area: ${shape.area()}")
    }
}