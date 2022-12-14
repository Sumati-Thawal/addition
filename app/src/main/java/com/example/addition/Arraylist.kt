package com.example.myapplication

fun main(args: Array<String>) {

    var age=ArrayList<Int>()
    age.add(10)
   age.add(20)
    age.add(15)

    println("first element of array =  "+age[0])
    println("second element of array =  "+age.get(1))
    println("third element of array = ${age[2]} ")

    println("______________________________________________")
    age.remove(15)
    println(age.size)

    println("first element of array =  "+age[0])
    println("second element of array =  "+age.get(1))

    println("______________________________________________")

    var car =arrayListOf<String>("mercedes","BMW","Opel")
    println("first element of array =  "+car[0])
    println("second element of array =  "+car.get(1))
    println("third element of array =  "+car[2])

    car.add("ford")
    println("______________________________________________")
    println("first element of array =  "+car[0])
    println("second element of array =  "+car.get(1))
    println("third element of array =  "+car[2])
    println("fourth element of array =  "+car[3])

    var MymMxArryay= arrayListOf<Any>()
    MymMxArryay.add("ford")
    MymMxArryay.add(1)
    MymMxArryay.add(99.99)
    MymMxArryay.add(true)
    println("______________________________________________")
    println("first element of array =  "+MymMxArryay[0])
    println("second element of array =  "+MymMxArryay.get(1))
    println("third element of array =  "+MymMxArryay[2])
    println("fourth element of array =  "+MymMxArryay[3])




}

