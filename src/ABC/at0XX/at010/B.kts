
fun solveX(n: Int, a: IntArray) {
    println(a.sumBy {
        when (it % 6) {
            1, 3 -> 0
            2 -> 1
            0 -> 3
            else -> it % 6 - 3
        }
    })
}

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    solveX(n, a)
}