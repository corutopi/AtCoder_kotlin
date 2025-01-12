
fun solveY(n: Int) {
    val a = mutableListOf(0, 0, 1)
    repeat(1000000) {
        val t = a.count()
        a.add((a[t - 3] + a[t - 2] + a[t - 1]) % 10007)
    }
    println(a[n - 1])
}

fun main() {
    val n = readLine()!!.toInt()
//    val n = 10
    solveY(n)
}