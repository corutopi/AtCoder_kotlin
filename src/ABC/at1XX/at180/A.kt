package ABC.at1XX.at180


fun solve(n: Int, a: Int, b: Int) {
    println(n - a + b)
}


fun main() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
    solve(n, a, b)
}