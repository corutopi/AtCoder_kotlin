
fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    var x = n
    var ans = 0
    while (x > 0) {
        ans += 1
        x /= k
    }
    print(ans)
}