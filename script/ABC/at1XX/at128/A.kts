
fun solve(A: Int, P: Int) {
    println((A * 3 + P) / 2)
}

fun main() {
//    val S = readLine()!!
//    val N = readLine()!!.toInt()
    val (A, P) = readLine()!!.split(" ").map { it.toInt() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(A, P)
}