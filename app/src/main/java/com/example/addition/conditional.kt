package com.example.myapplication

fun main(args: Array<String>) {
    var number: Int = 5
    var number2: Int = 8
    var number3: Int = 12


    var result: Boolean = true


    result=(number<number2)&&(number3>number)

    println("result=  "+result)

    result=(number<number2)||(number3>number)

    println("result=  "+result)


}
