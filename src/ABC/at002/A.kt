package ABC.at002

import kotlin.math.max

fun solveX(x: Long, y: Long) {
    println(max(x, y))
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
    val (x, y) = readLine()!!.split(" ").map { it.toLong() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(x, y)
}