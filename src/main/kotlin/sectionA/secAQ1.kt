package org.example.sectionA

//Create a class 'Car' with properties: brand, model, and price. Create 3 objects and print their details.

class Car{
    var brand:String=""
    var model:String=""
    var price:Double=0.0

    fun carDetails() {
        println("Car of $brand, Model: $model has price: $price")
    }
}

fun main() {
    val swift = Car()
    swift.brand = "Suzuki"
    swift.model = "Swift"
    swift.price = 7500000.00
    swift.carDetails()
}