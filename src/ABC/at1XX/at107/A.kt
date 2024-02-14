package ABC.at1XX.at107

fun solve(n: Int, i:Int) {
    println(n + 1 - i)
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
    val (n, i) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(n, i)
}