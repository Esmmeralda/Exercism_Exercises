ackage com.esmedev.androidmaster.exercise

import java.util.Locale


/*
 Convert a phrase to its acronym.

Techies love their TLA (Three Letter Acronyms)!

Help generate some jargon by writing a program that converts a long name like Portable Network Graphics to its acronym (PNG).

Punctuation is handled as follows: hyphens are word separators (like whitespace); all other punctuation can be removed from the input.

    - As Soon As Posible = ASAP
    - Liquid-crystal display = LCD
    - Thank God it's Friday = TGIF
 */


fun main() {
    val acronimo = generate("The Road _Not_ Taken")
}

fun generate(phrase: String):String {
    val replaced = phrase.replace("w*[-_]w*".toRegex()," ")
    var palabras:MutableList<String> = replaced.split(" ").toMutableList()

    while (palabras.indexOf("") != -1){
         palabras.removeAt(palabras.indexOf(""))
    }

    var acronimo = mutableListOf<Char>()
    var acronimoConcatenado = ""


    for (palabra in palabras) {
        acronimo.add(palabra.first())
        acronimoConcatenado += palabra.first()

    }
    val uppercase = acronimoConcatenado.uppercase()

    return uppercase
}





