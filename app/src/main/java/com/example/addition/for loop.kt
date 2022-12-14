package com.example.myapplication

fun main(args: Array<String>) {


   /* for (number in 0..10)
        println(number)

    */

   /* var sum:Int= 0
    for (x in 0..10) {
        if (x % 2==0) {
            println(x)
            sum += x
        }
    }
    println("Sum of even number = $sum")

    */

  /*  var mynumberarray= arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for (y in 0.. (mynumberarray.size)-1)
{
println("mynumberarray[$y]=${mynumberarray[y]}")
}



    var mynumberarray= arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for (y in mynumberarray.indices)
    {
        println("mynumberarray[$y]=${mynumberarray[y]}")
    }

   */

    var mynumberarray= arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    mynumberarray.forEach{ println(it) }

}