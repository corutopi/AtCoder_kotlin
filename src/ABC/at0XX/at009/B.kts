
fun solveX(n: Int, a: Array<Int>) {
    println(a.distinct().sorted().reversed()[1])
}

fun main() {
    val n = readLine()!!.toInt()
    val a = Array(n) { readLine()!!.toInt() }
    solveX(n, a)
}