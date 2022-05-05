package ABC.at009

import kotlin.math.roundToInt

fun solveX(n: Int) {
    println((n.toDouble() / 2).roundToInt())
}

fun main() {
    val n = readLine()!!.toInt()
    solveX(n)
}