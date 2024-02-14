package ABC.at0XX.at006

fun solveX(n: Int) {
    println(if (n % 3 == 0) { "YES" } else { "NO" })
}

fun main() {
//    val s = readLine()!!
    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(n)
}