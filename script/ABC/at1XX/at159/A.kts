
fun solve(N: Int, M: Int) {
    var ans = 0
    ans += N * (N - 1) / 2
    ans += M * (M - 1) / 2
    println(ans)
}

fun main() {
//    val S = readLine()!!
//    val N = readLine()!!.toInt()
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(N, M)
}