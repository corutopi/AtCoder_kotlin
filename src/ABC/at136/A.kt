package ABC.at136

fun solve(a: Int, b: Int, c: Int) {
    println(c - Math.min(a - b, c))
}

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    solve(a, b, c)
}