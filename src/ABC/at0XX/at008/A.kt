package ABC.at0XX.at008

fun solveX(s: Int, t: Int) {
    println(t - s + 1)
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
    val (s, t) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(s, t)
}