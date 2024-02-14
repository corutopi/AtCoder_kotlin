package ABC.at1XX.at161

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }.sortedDescending()
    val sum = a.sum()
    var ans = "Yes"
    if (a[m - 1] * m * 4 < sum) {
        ans = "No"
    }
    println(ans)
}