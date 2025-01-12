
import kotlin.math.min


fun solve(N: Long, A: Long, B: Long) {
    val rep = N / (A + B)
    val sur = N % (A + B)
    println(rep * A + min(A, sur))
}

fun main() {
//    val S = readLine()!!
//    val N = readLine()!!.toInt()
    val (N, A, B) = readLine()!!.split(" ").map { it.toLong() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(N, A, B)
}