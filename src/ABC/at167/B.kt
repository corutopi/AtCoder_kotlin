package ABC.at167

fun main() {
    val (a, b, c, k) = readLine()!!.split(" ").map { it.toInt() }
    var ans: Int
    if (k <= a) {
        ans = k
    } else {
        ans = a
        if (k <= a + b) {
        } else {
            ans -= k - (a + b)
        }
    }
    println(ans)
}