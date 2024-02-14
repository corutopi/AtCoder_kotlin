package ABC.at0XX.at005

fun solveX(n: Int, t: Array<Int>) {
    println(t.min())
}

fun main() {
    val n = readLine()!!.toInt()
    val t = Array(n) { readLine()!!.toInt() }
    solveX(n, t)
}