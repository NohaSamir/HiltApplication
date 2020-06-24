package com.noha.hiltapplication.model

import javax.inject.Inject

//ToDo 4 : Tell Hilt how to create instance by add @Inject annotation before constructor

// Now we tell hilt How to create Car but it doesn't know how to create Engine
// if you run now you will see this error:
// Engine cannot be provided without an @Inject constructor or an @Provides-annotated method
// Now we need to tell Hilt How to create instance of Engine

class Car @Inject constructor(private val engine: Engine) {
    init {
        println("Car init")
    }

    fun start() = "Car started"

}