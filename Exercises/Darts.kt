package com.esmedev.ejerciciosesme.ejercicios


import com.esmedev.ejerciciosesme.ejercicios.Darts.score

/*
    Write a function that returns the earned points in a single toss of a Darts game.
    Darts is a game where players throw darts at a target.

    In our particular instance of the game, the target rewards 4 different amounts of points,
    depending on where the dart lands:
        - If the dart lands outside the target, player earns no points (0 points)
        - If the dart lands in the outer circle of the target, player earns 1 point
        - If the dart lands in the middle circle of the target, player earns 5 points.
        - If the dart lands in the inner circle of the target, player earns 10 points

    The outer circle has a radius of 10 units (this is equivalent to the total radius for the
    entire target), the middle circle a radius of 5 units, and the inner circle a radius of 1.
    Of course, they are all centered at the same point — that is, the circles are concentric
    defined by the coordinates (0, 0).

    Write a function that given a point in the target (defined by its Cartesian coordinates x and
    y, where X and Y are REAL), returns the correct amount earned by a dart landing at that point.
 */

fun main(){
    score(-11,-11)
}

object Darts {

    fun score(x: Any, y: Any ): Int {
        var score:Int = 0
        var xDouble:Double
        var yDouble:Double
        if(x is Int ){
            xDouble = x.toDouble()

        }else{
            xDouble = x as Double

        }
        if(y is Int){
            yDouble = y.toDouble()
        }else{
            yDouble = y as Double
        }
        when {
            xDouble> 10.00 || yDouble > 10.00 || xDouble < -10.00 || yDouble < -10.00 -> score = 0
            xDouble in 5.01..10.00 || yDouble in 5.01..10.00-> score = 1
            xDouble in 1.01..5.00 || yDouble in 1.01..5.00-> score = 5
            xDouble in 0.00..1.00 || yDouble in 0.00..1.00-> score = 10
            xDouble in -10.00.. -5.01 || yDouble in -10.00.. -5.01 -> score = 1
            xDouble in -5.00..-1.01|| yDouble in -5.00.. -1.01 -> score = 5
            xDouble in -1.00.. 0.00 || yDouble in -1.00.. 0.00 -> score = 10

            else -> {score = 0}
        }
        return score
    }
}



