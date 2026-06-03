package org.example.sectionC

//Create a base class 'Animal' with functions eat() and sleep(). Create a derived class 'Dog' that adds bark().

open class Animal {
    var name : String = ""

    fun eat() {
        println("$name is eating")
    }
    fun sleep() {
        println("$name is sleeping")
    }
}

class Dog: Animal() {
    fun bark() {
        println("$name is barking")
    }
}

fun main() {
    val myDog = Dog()
    myDog.name = "Woody"

    myDog.bark()
    myDog.eat()
    myDog.sleep()
}