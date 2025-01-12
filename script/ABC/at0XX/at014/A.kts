
fun solveX(a: Int, b: Int) {
    println(if (a % b == 0) 0 else b - (a % b))
}

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    solveX(a, b)
}