package com.noha.hiltapplication.model

import javax.inject.Inject

//ToDo 5 : Tell Hilt how to create instance by add @Inject annotation before constructor
class Engine @Inject constructor(){

    init {
        println("Engine init")
    }
}

//ToDo 6 : Run your app
// Congratulation: now you learn how to inject fields
