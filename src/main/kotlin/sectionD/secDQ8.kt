package org.example.sectionD

//Create an interface 'Playable' with function play(). Implement it in classes 'Cricket' and 'Football'.

interface Playable {
    fun play() {
        println("Playing Sport")
    }
}

class Cricket: Playable {
    override fun play() {
        println("Playing Cricket")
    }
}

class Football: Playable {
    override fun play() {
        println("Playing Football")
    }
}

fun main() {
    val cricket = Cricket()
    val football = Football()
    cricket.play()
    football.play()
    
}