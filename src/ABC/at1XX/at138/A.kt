package ABC.at1XX.at138

fun solve(a: Int, s: String) {
    println(if (a >= 3200) s else "red")
}

fun main() {
    val a = readLine()!!.toInt()
    val s = readLine()!!
    solve(a, s)
}