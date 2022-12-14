package com.example.myapplication

fun main(args: Array<String>) {

    print("Please Enter 1st numbers")
    var number1:Int= readLine()!!.toInt()

    print("Please Enter 2nd numbers  ")
    var number2:Int= readLine()!!.toInt()
    show(number1,number2)
    var a=add(number1,number2)
    println("sum of two number=  $a")

    var b= Findminimum(number1,number2)
    println("the minimum  number= $b")
}


fun  show(num1:Int,num2:Int)
{
    println("you entered $num1 and $num2")

}
fun add(num1: Int,num2: Int):Int
{
    var sum= 0
    sum=num1+num2

    return(sum)
}

fun Findminimum(num1: Int,num2: Int):Int
{
   var minimum:Int
   if (num1>num2)
   {

       minimum=num2
   }
    else
        minimum=num1

    return minimum
}