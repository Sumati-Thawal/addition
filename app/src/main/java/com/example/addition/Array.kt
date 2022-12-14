package com.example.myapplication

fun main(args: Array<String>) {
     var age = arrayOf(1,2,3,"jjkjk")
    println("first element of array =  "+age[0])
    println("second element of array =  "+age.get(1))
    println("third element of array =  "+age[2])
    println("third element of array =  "+age[3])

    println("*********************************************")
    var car = arrayOf("mercedes","BMW","Opel")
    println("first element of array =  "+car[0])
    println("second element of array =  "+car.get(1))
    println("third element of array =  "+car[2])

    car.set(2,"ford")
    println("*********************************************")
    println("first element of array =  "+car[0])
    println("second element of array =  "+car.get(1))
    println("third element of array =  "+car[2])


    println("size of car array = "+car.size)

    var carAndAge= arrayOf("merceder",5,"ford",10)
    println("*********************************************")
    println("first element of array =  "+carAndAge[0])
    println("second element of array =  "+carAndAge.get(1))
    println("third element of array =  "+carAndAge[2])
    println("fourth element of array =  "+carAndAge[3])

    carAndAge.set(3,"20")
    println("*********************************************")
    println("first element of array =  "+carAndAge[0])
    println("second element of array =  "+carAndAge.get(1))
    println("third element of array =  "+carAndAge[2])
    println("fourth element of array =  "+carAndAge[3])

}