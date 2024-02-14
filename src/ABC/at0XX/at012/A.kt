package ABC.at0XX.at012

fun solveX(a: Int, b: Int) {
    println(String.format("%d %d", b, a))
}

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    solveX(a, b)
}