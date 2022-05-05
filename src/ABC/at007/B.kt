package ABC.at007

fun solveX(s: String) {
    println(if (s == "a") -1 else 'a')
}

fun main() {
    val s = readLine()!!
//    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(s)
}