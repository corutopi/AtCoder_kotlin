package ABC.at016

fun solveX(a: Int, b: Int, c: Int) {
    println(
            if (a + b == c && b == 0) '?'
            else if (a + b == c) '+'
            else if (a - b == c) '-'
            else '!'
    )
}

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    solveX(a, b, c)
}