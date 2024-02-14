package ABC.at1XX.at108

fun solve(k:Int) {
    when (k % 2) {
        0 -> println((k / 2) * (k / 2))
        1 -> println((k / 2) * (k / 2 + 1))
    }
}

fun main() {
//    val s = readLine()!!
    val k = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(k)
}