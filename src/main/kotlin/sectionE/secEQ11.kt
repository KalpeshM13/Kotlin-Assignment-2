package org.example.sectionE

//Create a list of Animal objects (Dog, Cat etc.) and call makeSound() using polymorphism.

open class Animal {
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Dog barking....Woof Woof!")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Cat Meowing ... Meow Meow!")
    }
}

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Dog())

    for (animal in animals) {
        animal.makeSound()
    }
}