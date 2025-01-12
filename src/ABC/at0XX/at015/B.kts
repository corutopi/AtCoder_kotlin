
fun solveX(n: Int, a: List<Int>) {
    println(Math.ceil(a.filter { it != 0 }.average()).toInt())
}

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(n, a)
}