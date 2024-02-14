package ABC.at1XX.at115

fun solve(d: Int) {
    var ans = ""
    when (d) {
        25 -> ans = "Christmas"
        24 -> ans = "Christmas Eve"
        23 -> ans = "Christmas Eve Eve"
        22 -> ans = "Christmas Eve Eve Eve"
    }
    println(ans)
}

fun main() {
//    val s = readLine()!!
    val d = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(d)
}