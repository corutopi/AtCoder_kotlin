
fun solveX(s: String) {
    println(s[0].toUpperCase() + s.substring(1, s.count()).toLowerCase())

}

fun main() {
    val s = readLine()!!
    solveX(s)
}