package ABC.at1XX.at150

fun solve(K: Int, X: Int) {
    var ans = "No"
    if(500 * K >= X) {
        ans = "Yes"
    }
    println(ans)
}

fun main() {
//    val S = readLine()!!
//    val N = readLine()!!.toInt()
    val (K, X) = readLine()!!.split(" ").map { it.toInt() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(K, X)
}