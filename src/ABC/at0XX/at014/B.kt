package ABC.at0XX.at014

fun solveX(n: Int, X: Int, a: List<Int>) {
    println(Array(n) { i ->
        if (X shr i and 1 == 1) a[i] else 0
    }.sum())
}

fun main() {
    val (n, X) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(n, X, a)
}
