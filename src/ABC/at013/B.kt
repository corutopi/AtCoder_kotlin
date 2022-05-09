package ABC.at013

import kotlin.math.abs
import kotlin.math.min

fun solveX(a: Int, b: Int) {
    val (small, big) = arrayListOf(a, b).sorted()
    println(min(abs(big - small), 9 - big + small + 1))
}

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    solveX(a, b)
}