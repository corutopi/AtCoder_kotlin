
fun solveX(a: List<Int>) {
    println(a.sorted()[1])
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val t = Array(n) { readLine()!! }
    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(a)
}