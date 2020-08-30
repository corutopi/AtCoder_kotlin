package ABC.at152

fun solve(N:Int, M:Int) {
    if (N == M) {
        println("Yes")
    } else {
        println("No")
    }
}

fun main() {
//    val S = readLine()!!
//    val N = readLine()!!.toInt()
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(N, M)
}