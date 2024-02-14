package ABC.at0XX.at020

fun solveX(q: Int) {
    println(if (q == 1) "ABC" else "chokudai")
}

fun main() {
    val q = readLine()!!.toInt()
    solveX(q)
}