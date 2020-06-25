package com.noha.hiltapplication.model

import javax.inject.Inject

class Engine @Inject constructor(){
    init {
        println("Engine init")
    }
}

