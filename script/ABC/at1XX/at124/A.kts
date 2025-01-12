
fun solve(a: Int, b: Int) {
    println(Math.max(a, b) + Math.max(Math.max(a, b) - 1, Math.min(a, b)))
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(a, b)
}