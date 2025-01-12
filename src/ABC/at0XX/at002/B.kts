
fun solveX(w: String) {
    println(w.replace("a", "")
            .replace("i", "")
            .replace("u", "")
            .replace("e", "")
            .replace("o", ""))
}

fun main() {
    val w = readLine()!!
//    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(w)
}