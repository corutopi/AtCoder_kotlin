package ABC.at155


fun solve(N: Int, A: List<Int>) {
    var ans = "APPROVED"
    for (a in A) {
        if (a % 2 == 0) {
            if (!(a % 3 == 0 || a % 5 == 0)) {
                ans = "DENIED"
                break
            }
        }
    }
    println(ans)
}

fun main() {
//    val S = readLine()!!
    val N = readLine()!!.toInt()
//    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(N, A)
}