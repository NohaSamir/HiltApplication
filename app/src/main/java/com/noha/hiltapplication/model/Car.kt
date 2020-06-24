package com.noha.hiltapplication.model

class Car(private val engine: Engine) {
    init {
        println("Car init")
    }

    fun start() = "Car started"

}