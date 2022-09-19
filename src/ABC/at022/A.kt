package ABC.at022

fun solveX(n: Int, s: Int, t: Int, a: Array<Int>) {
    var ans = 0;
    var weight = 0
    a.forEach { it ->
        weight += it
        ans += if (s <= weight && weight <= t) 1 else 0
    }

    println(ans)
}

fun main() {
    val (n, s, t) = readLine()!!.split(" ").map { it.toInt() }
    val a = Array(n) { readLine()!!.toInt() }
    solveX(n, s, t, a)
}