package ABC.at1XX.at153

fun solve(H:Int, A:Int) {
    var ans = H / A
    if (H % A > 0) {
        ans += 1
    }
    println(ans)
}

fun main() {
//    val S = readLine()!!
//    val N = readLine()!!.toInt()
    val (H, A) = readLine()!!.split(" ").map { it.toInt() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(H, A)
}