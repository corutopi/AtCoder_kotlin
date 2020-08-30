package ABC.at154

fun solve(S: String) {
    println("x".repeat(S.count()))
}

fun main() {
    val S = readLine()!!
//    val N = readLine()!!.toInt()
//    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(S)
}