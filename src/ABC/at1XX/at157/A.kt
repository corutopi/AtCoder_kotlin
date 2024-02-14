package ABC.at1XX.at157


fun solve(N: Int) {
    println(N / 2 + N % 2)
}

fun main() {
//    val S = readLine()!!
    val N = readLine()!!.toInt()
//    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(N)
}