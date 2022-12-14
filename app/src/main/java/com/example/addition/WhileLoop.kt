package com.example.myapplication

import kotlin.random.Random

fun main(args: Array<String>) {
/*
    var i=5
    while (i>0)
{
        println(i)
    i--
}



    var k= 1
    var fact=1
    while (k<6)
    {
        fact*= k
        println("$k!=$fact")
        k++
    }
     */

    var number=Random.nextInt(0,100)
    println("Please enter number")

    while (2 > 1)
    {
        val userguess:Int= readLine()!!.toInt()
        if (userguess==number)
        {
            println("Congratulation, you know number in my mind")
            break
    }
        else if (userguess<number)
                println("increase the number")
            else
                println("decrease the number")

    }

}