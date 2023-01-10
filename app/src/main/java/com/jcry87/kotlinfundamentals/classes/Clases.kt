package com.jcry87.kotlinfundamentals.classes

fun main(){
    val phone: Phone = Phone(12345678)
    phone.call()
    phone.showNumber()

    val smartphone = Smartphone(966777888, true)
    smartphone.call()
    smartphone.showNumber()
}