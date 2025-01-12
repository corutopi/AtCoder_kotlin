
fun solveX(A: Long, M: Long, L: Long, R: Long) {
    val a = A % M
    val l = L % M + M
    val r = R + (l - L)
    val kMin = if ((l - a) % M == 0L) (l - a) / M else (l - a) / M + 1
    val kMax = (r - a) / M

//    println(a)
//    println(l)
//    println(r)
    println(if (kMax < kMin) 0 else (kMax - kMin) + 1)
}

fun main() {
    val (A, M, L, R) = readLine()!!.split(" ").map { it.toLong() }
    solveX(A, M, L, R)
}

//main()
solveX(5, 10, 3, 5)
solveX(5, 3, -1, 6)
solveX(-2, 2, 1 ,1)
solveX(-177018739841739480, 2436426, -80154573737296504, 585335723211047198)