package ABC.at1XX.at109

fun solve(a: Int, b: Int) {
    when (a * b % 2) {
        0 -> println("No")
        1 -> println("Yes")
    }
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(a, b)
}