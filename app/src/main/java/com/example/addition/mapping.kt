package com.example.myapplication

fun main(args: Array<String>) {
    println("___________Immutable Array___________")
    var age= mapOf<String,Int>("david" to 20,"Ranaldo" to 25)

    println("Age of davide=  "+age["david"])
    println("Age of Ranaldo=  "+age["Ranaldo"])

    println("___________mutable Array___________")
    var mutableage= mutableMapOf<String,Int>("david" to 20,"Ranaldo" to 25)
    mutableage.put("buffon",30)
    println("Age of davide=  "+ mutableage["david"])
    println("Age of Ranaldo=  "+ mutableage["Ranaldo"])
    println("Age of buffon=  "+ mutableage["buffon"])
}