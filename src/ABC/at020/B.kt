package ABC.at020

fun solveX(a: Int, b: Int) {
    println((a.toString() + b.toString()).toInt() * 2)
}

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    solveX(a, b)
}