package com.jcry87.kotlinfundamentals.classes

open class Phone (val number: Int) {

    fun call(){
        println("Calling...")
    }

    open fun showNumber(){
        println("My phone number is $number")
    }
}