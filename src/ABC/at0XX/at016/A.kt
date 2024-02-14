package ABC.at0XX.at016

fun solveX(m: Int, d: Int) {
    println(if (m % d == 0) "YES" else "NO")
}

fun main() {
    val (m, d) = readLine()!!.split(" ").map { it.toInt() }
    solveX(m, d)
}