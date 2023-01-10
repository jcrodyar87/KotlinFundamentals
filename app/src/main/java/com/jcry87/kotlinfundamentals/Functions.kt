package com.jcry87.kotlinfundamentals

fun main(){
    sayHello()
    newTopic("Args")
    //println(sum(2, 3))
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")

    showProduct("Juice", validity = "15th March")
    showPersons("Juan","Carlos","Silvia","Elizabeth","Mary")
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

fun showProduct(name: String, promo: String = "No promotion", validity: String = "0 stock"){
    println("$name = $promo until $validity")
}
fun showPersons(vararg persons: String){
    for(person in persons){
        println(person)
    }
    var index = 0
    while(index < persons.size){
        println(persons[index])
        index++
    }

    newTopic("when")
    index = (0..persons.size - 1).random()
    println(index)
    when(persons[index]){
        "Angel" -> println("It's an angel!")
        "Mary" -> {
            println("It's Mary Jane")
        }
    }
}
