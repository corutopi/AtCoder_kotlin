
fun solve(a:Int, b:Int, c:Int) {
    println(10 * c + b + a)
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }.sorted()
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(a, b, c)
}