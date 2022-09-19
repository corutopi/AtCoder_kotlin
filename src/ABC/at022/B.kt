package ABC.at022

fun solveX(n: Int, a: Array<Int>) {
    val visited = Array(100000 + 1) { 0 }
    var ans = 0
    a.forEach {
        ans += if (visited[it] > 0) 1 else 0
        visited[it] = 1
    }
    println(ans)

}

fun main() {
    val n = readLine()!!.toInt()
    val a = Array(n) { readLine()!!.toInt() }
    solveX(n, a)
}