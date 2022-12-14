package com.example.myapplication

fun main(args: Array<String>) {

    print("What is your name")
    var name:String?= readLine()

    print("What is your age")
    var age:Int= readLine()!!.toInt()

    println("your name is $name and youe age is "+age)
}