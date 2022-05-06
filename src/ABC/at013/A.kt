package ABC.at013

fun solveX(s: String) {
    val alp = "0ABCDE"
    println(alp.indexOf(s))
}

fun main() {
    val s = readLine()!!
    solveX(s)
}