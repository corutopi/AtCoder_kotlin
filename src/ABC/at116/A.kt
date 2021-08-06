package ABC.at116

fun solve(a:Int,b:Int,c:Int) {
    println(a * b / 2)
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
    val (a, b,c) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(a,b,c)
}