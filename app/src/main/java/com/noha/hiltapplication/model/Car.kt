package com.noha.hiltapplication.model

import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine) {
    init {
        println("Car init")
    }

    fun start() = "Car started"

}