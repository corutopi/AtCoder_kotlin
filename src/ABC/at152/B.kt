package ABC.at152

fun solve(a: String, b: String) {
    val ab = a.repeat(b.toInt())
    val ba = b.repeat(a.toInt())

    var ans = ba
    if (ab <= ba) {
        ans = ab
    }
    println(ans)
}

fun main() {
//    val S = readLine()!!
//    val N = readLine()!!.toInt()
    val (a, b) = readLine()!!.split(" ")
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(a, b)
}