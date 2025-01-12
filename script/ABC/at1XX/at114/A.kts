
fun solve(x:Int) {
    when (x) {
        7,5,3 -> println("YES")
        else -> println("NO")
    }
}

fun main() {
//    val s = readLine()!!
    val x = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(x)
}