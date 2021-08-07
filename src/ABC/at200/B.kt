package ABC.at200

fun solve(n:Long, k:Long) {
    var ans = n
    repeat(k.toInt()) {
        ans = when (ans % 200) {
            0L -> ans / 200
            else -> (ans.toString() + "200").toLong()
        }
    }
    println(ans)
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(n,k)
}