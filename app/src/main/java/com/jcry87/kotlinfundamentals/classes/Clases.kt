package com.jcry87.kotlinfundamentals.classes

fun main(){
    val phone: Phone = Phone(12345678)
    phone.call()
    phone.showNumber()

    val smartphone = Smartphone(966777888, true)
    smartphone.call()
    smartphone.showNumber()

    val myUser = User(0,"Juan","Rodriguez", 35, Group.FAMILY.ordinal)
    var brother = myUser.copy(1,"Mary")
    val friend = brother.copy(2, group = Group.FRIEND.ordinal)
    println(myUser)
    println(brother)
    println(friend)
}