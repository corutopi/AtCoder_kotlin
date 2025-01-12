
fun solve(n: Int) {
    println((n - 1) / 100 + 1)
}

fun main() {
//    val s = readLine()!!
    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(n)
}