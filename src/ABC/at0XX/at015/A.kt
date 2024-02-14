package ABC.at0XX.at015

fun solveX(A: String, B: String) {
    println(if (A.length > B.length) A else B)
}

fun main() {
    val A = readLine()!!
    val B = readLine()!!
//    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val t = Array(n) { readLine()!! }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(A, B)
}