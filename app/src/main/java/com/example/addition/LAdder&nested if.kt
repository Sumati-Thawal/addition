package com.example.myapplication


fun main(args: Array<String>) {

    print("please enter 3 numbers  ")

    var number:Int= readLine()!!.toInt()
    var number1:Int= readLine()!!.toInt()
    var number2:Int= readLine()!!.toInt()

    var largestnumber :Int

    if (number>=number1)
    {
        if (number >= number2) {
            largestnumber = number
        } else {
            largestnumber = number2
        }
    }
        else
        {
            if (number1 >= number2)
            {
                largestnumber = number1
            }
            else
            {
                largestnumber = number2
            }

        }
    println("the Largest number is  $largestnumber")



/*
    print(" Please Ennter the age = ")

    var age:Int= readLine()!!.toInt()

    if (age<13)
    {
      print("you are child")
    }
    else if (age<19)
    {
    print("You are teenager")
    }
    else
    {
        if (age<65)
        {
        print("you are adult")
    }
        else
        {
           print("you are senior")
        }
}

 */
}