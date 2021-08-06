package ABC.at112

fun solve() {
    when (readLine()!!.toInt()) {
        1 -> println("Hello World")
        2 -> println(readLine()!!.toInt() + readLine()!!.toInt())
    }
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve()
}