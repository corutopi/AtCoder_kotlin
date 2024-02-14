package ABC.at1XX.at165

fun solve(k: Int, a: Int, b: Int) {
    var ans = "OK"
    val aa = a % k
    val bb = b % k
    if (b - a < k) {
        if (aa == 0 || bb == 0) {
        } else {
            if (aa <= bb) {
                ans = "NG"
            }
        }
    }
    println(ans)
}

fun main() {
    val k = readLine()!!.toInt()
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    solve(k, a, b)
}