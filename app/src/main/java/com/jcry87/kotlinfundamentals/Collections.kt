package com.jcry87.kotlinfundamentals

import com.jcry87.kotlinfundamentals.classes.Group
import com.jcry87.kotlinfundamentals.classes.User

fun main(){
    // readOnly
    val fruits = listOf<String>("Apple","Banana","Orange")
    println(fruits.get((0..fruits.size-1).random()))
    println("Index of Orange is ${fruits.indexOf("Orange")}")
    // mutable
    val myUser = User(0,"Juan","Rodriguez", 35, Group.FAMILY.ordinal)
    var brother = myUser.copy(1,"Mary")
    val friend = brother.copy(2, group = Group.FRIEND.ordinal)
    val users = mutableListOf<User>(myUser, brother)
    println(users)
    users.add(friend)
    println(users)
    users.removeAt(1)
    println(users)
}