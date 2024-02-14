package ABC.at0XX.at021

fun solveX(n: Int, a: Int, b: Int, k: Int, p: MutableList<Int>) {
    p.add(a)
    p.add(b)
    println(if (p.groupBy { it }.values.maxBy { it.count() }!!.count() == 1) "YES" else "NO")

}

fun main() {
//    val s = readLine()!!
    val n = readLine()!!.toInt()
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val k = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    solveX(n, a, b, k, p)
}