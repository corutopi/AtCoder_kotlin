package ABC.at1XX.at196


fun solve(a: Int, b: Int, c: Int, d: Int) {
    println(b - c)
}

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val (c, d) = readLine()!!.split(" ").map { it.toInt() }
    solve(a, b, c, d)
}