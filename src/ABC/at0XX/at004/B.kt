package ABC.at0XX.at004

fun solveX(c: List<List<String>>) {
    for (i in 3 downTo 0) {
        println(c[i].reversed().joinToString(" "))
    }
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val c = (0 until 4).map { readLine()!!.split(" ")}
    solveX(c)
}