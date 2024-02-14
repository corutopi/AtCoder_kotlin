package ABC.at0XX.at008

fun solveX(n: Int, s: Array<String>) {
    val x = s.groupingBy { it }.eachCount().maxBy { it.value }
    println(x?.key)
}

fun main() {
    val n = readLine()!!.toInt()
    val t = Array(n) { readLine()!! }
    solveX(n, t)
}