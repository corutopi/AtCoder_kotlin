

fun solveX(n: Int, k: Int, a: List<Int>) {
    if (k % 2 == 0) {
        val ans = (0 until k - 1 step 2)
                .map { kotlin.math.abs(a[it] - a[it + 1])}
                .sum()
        print(ans)
    } else {
        val x = (0 until k - 2 step 2)
                .map { kotlin.math.abs(a[it] - a[it + 1])}
        val y = (1 until k - 1 step 2)
                .map { kotlin.math.abs(a[it] - a[it + 1])}
        var sub = y.sum()
        var ans = sub
        for (i in 0..x.size - 1) {
            sub += x[i]
            sub -= y[i]
            ans = kotlin.math.min(ans, sub)
        }
        println(ans)
    }
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(n, k, a)
}

main()