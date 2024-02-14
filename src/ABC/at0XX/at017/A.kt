package ABC.at0XX.at017

fun solveX(se: Array<IntArray>) {
    println(se.sumBy { it[0] * it[1] / 10 })
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val t = Array(n) { readLine()!! }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    val se = Array(3) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }
    solveX(se)
}