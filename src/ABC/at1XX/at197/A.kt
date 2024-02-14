package ABC.at1XX.at197

fun solveX(s: String) {
    println(s.substring(1) + s.substring(0, 1))
}

fun main() {
    val s = readLine()!!
//    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(s)
}