package com.esmedev.ejerciciosesme.ejercicios

import com.esmedev.ejerciciosesme.ejercicios.Raindrops.convert

/*
  Convert a number into its corresponding raindrop sounds.

  If a given number:
    - is divisible by 3, add "Pling" to the result.
    - is divisible by 5, add "Plang" to the result.
    - is divisible by 7, add "Plong" to the result.
    - is not divisible by 3, 5, or 7, the result should be the number as a string.

    Examples:
    - 28 is divisible by 7, but not 3 or 5, so the result would be "Plong".
    - 30 is divisible by 3 and 5, but not 7, so the result would be "PlingPlang".
    - 34 is not divisible by 3, 5, or 7, so the result would be "34".
 */

fun main(){
    convert(1)
}

object Raindrops {
    fun convert(n: Int): String  {
        var output:String = ""
        when {
            n%3 == 0 && n%5 == 0 && n%7 == 0 -> output = ("PlingPlangPlong")
            n%3 == 0 && n%5 == 0 -> output = ("PlingPlang")
            n%3 == 0 && n%7 == 0 -> output =("PlingPlong")
            n%5 == 0 && n%7 == 0 -> output =("PlangPlong")
            n%3 == 0 -> output =("Pling")
            n%5 == 0 -> output =("Plang")
            n%7 == 0 -> output =("Plong")
            else -> output = n.toString()
        }
        return output
    }
}