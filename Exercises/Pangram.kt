package com.esmedev.ejerciciosesme.ejercicios

import com.esmedev.ejerciciosesme.ejercicios.Pangram.isPangram
import java.util.Locale

/*
  Figure out if a sentence is a pangram.
  It is case insensitive, so it doesn't matter if a letter is lower-case or upper-case.
  For this exercise, a sentence is a pangram if it contains each of the 26 letters in
  the English alphabet.
 */

fun main(){
    isPangram("the quick brown fox jumps over the lazy dog")
}

object Pangram {

    fun isPangram(input: String): Boolean {
        val toLowerCase:String = input.map{it.lowercase()}.toString()
        return ('a'..'z').all { toLowerCase.contains(it) }
    }
}
