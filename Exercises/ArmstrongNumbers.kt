package com.esmedev.ejerciciosesme.ejercicios

import kotlin.math.pow

/*
  An Armstrong number is a number that is the sum of its own
   digits each raised to the power of the number of digits.

   For example:
       - 9 is an Armstrong number, because 9 = 9^1 = 9
       - 10 is not an Armstrong number, because 10 != 1^2 + 0^2 = 1
       - 153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
       - 154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190
    Write some code to determine whether a number is an Armstrong number.
 */

fun main(){
    check(153)
    check(10)
}

fun check(input: Int): Boolean {
    val armstrongNumber:String = input.toString()
    val armstrongNumberLenght:Int = armstrongNumber.length
    val armstrongNumberStringList:MutableList<String> = armstrongNumber.split("").toMutableList()
    armstrongNumberStringList.remove("")
    armstrongNumberStringList.removeLast()
    val armstrongNumberList:MutableList<Int> = mutableListOf()

    for(number in armstrongNumberStringList){
            armstrongNumberList.add(number.toInt())
    }

    var armstrongNumberCalculus = 0

    for(number in armstrongNumberList){
       armstrongNumberCalculus +=  number.toDouble().pow(armstrongNumberLenght).toInt()
    }
    if (input == armstrongNumberCalculus) {
        return true
    }
    return false
}