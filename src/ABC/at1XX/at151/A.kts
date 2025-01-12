
fun solve(S: String) {
    val alp = "abcdefghijklmnopqrstuvwxyz"
    repeat(26) {
//        println(it)
        if (alp[it].toString() == S) {
            println(alp[(it + 1) % 26])
        }
    }
}

fun main() {
    val S = readLine()!!
//    val N = readLine()!!.toInt()
//    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(S)
}