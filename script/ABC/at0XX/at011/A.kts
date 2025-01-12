
fun solveX(n: Int) {
    println(if (n + 1 > 12) 1 else n + 1)
}

fun main() {
    val n = readLine()!!.toInt()
    solveX(n)
}