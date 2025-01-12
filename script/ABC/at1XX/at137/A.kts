

fun solve(a: Int, b: Int) {
    println(listOf(a + b, a - b, a * b).max())
}

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    solve(a, b)
}