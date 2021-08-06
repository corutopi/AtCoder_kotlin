package ABC.at111

fun solve(n: String) {
    var ans = ""
    n.toCharArray().forEach {
        ans += when (it) {
            '1' -> '9'
            '9' -> '1'
            else -> it
        }
    }
    println(ans)
}

fun main() {
    val n = readLine()!!
//    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(n)
}