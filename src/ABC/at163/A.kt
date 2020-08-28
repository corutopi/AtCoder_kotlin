package ABC.at163

fun solve(R: Int) {
    println(R * 2 * Math.PI)
}

fun main() {
//    val S = readLine()!!
    val R = readLine()!!.toInt()
//    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(R)
}