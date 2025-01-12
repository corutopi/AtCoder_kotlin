

fun solve(N:Int, K:Int, h:List<Int>) {
    var ans = 0
    for (hi in h) {
        ans += if (hi >= K) 1 else 0
    }
    println(ans)
}

fun main() {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val h = readLine()!!.split(" ").map { it.toInt() }
    solve(N, K, h)
}