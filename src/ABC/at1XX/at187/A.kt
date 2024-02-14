package ABC.at1XX.at187

import java.lang.Math.max

fun solve(a: Int, b: Int) {
    println(max(S(a), S(b)))
}

fun S(x: Int): Int {
    var ans = 0
    var xx = x
    while (xx > 0) {
        ans += xx % 10
        xx /= 10
    }
    return ans
}

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    solve(a, b)
}