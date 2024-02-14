package ABC.at1XX.at113

fun solve(x: Int, y: Int) {
    println(x + y / 2)
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(x, y)
}