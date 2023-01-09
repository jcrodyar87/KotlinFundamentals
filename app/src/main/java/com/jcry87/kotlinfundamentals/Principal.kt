package com.jcry87.kotlinfundamentals

fun main() {
    newTopic("Hello Kotlin")

    val a = 2 // constant
    val text = "Hello"
    var b: Int = 3 // variable
    var any: Any // cualquier tipo
    var objNull: String? // allow null
    objNull = null
    println(a)
    println(b)
}

fun newTopic(topic: String){
    println(topic)
}