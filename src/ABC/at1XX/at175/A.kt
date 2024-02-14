package ABC.at1XX.at175

fun solve(s: String) {
    var ans = 0
    var rainy = 0
    s.toCharArray().forEach {
        if (it == 'R') {
            rainy += 1
        } else {
            ans = Math.max(ans, rainy)
            rainy = 0
        }
    }
    println(Math.max(ans, rainy))
}

fun main() {
    val s = readLine()!!
    solve(s)
}