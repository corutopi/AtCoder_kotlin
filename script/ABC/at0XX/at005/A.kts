
fun solveX(x: Int, y:Int) {
    println(y / x)
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(x, y)
}