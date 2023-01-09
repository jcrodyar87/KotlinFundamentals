package com.jcry87.kotlinfundamentals

fun main(){
    sayHello()
    newTopic("Args")
    //println(sum(2, 3))
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")
}

private fun sayHello(){
    //  Unit = void
    println("hello Kotlin!")
}

fun sum(a: Int, b: Int): Int {
    val c = a + b
    return a + b
}

fun sub(a: Int, b: Int): Int{
    return a - b
}