
fun solveX(b: Int, g:Int) {
    println( if (b > g) "Bat" else "Glove")
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
    val (b, g) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(b, g)
}