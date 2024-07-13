package com.esmedev.ejerciciosesme.ejercicios

/*
 You have to reverse a given string (reading them right to left,
 instead of left to right).
 Some examples:

    - Turn "stressed" into "desserts".
    - Turn "strops" into "sports".
    - Turn "racecar" into "racecar".
 */

fun main(){
    reverse("Hola")
}
fun reverse(input: String): String {
   var reversedString:String = ""
    for(letra in input.length - 1 downTo 0){
        reversedString += input[letra]
    }
    return reversedString
}

