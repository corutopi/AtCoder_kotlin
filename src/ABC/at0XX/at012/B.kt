package ABC.at0XX.at012

fun solveX(n: Int) {
    val h = n / (60 * 60)
    val m = n % (60 * 60) / 60
    val s = n % 60
    println(String.format("%02d:%02d:%02d", h, m, s))
}

fun main() {
    val n = readLine()!!.toInt()
    solveX(n)
}