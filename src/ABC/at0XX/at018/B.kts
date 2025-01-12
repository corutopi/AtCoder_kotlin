
import java.lang.StringBuilder

fun solveX(s: String, n:Int, lr:Array<List<Int>>) {
    val tmp = StringBuilder(s)
    lr.forEach {
        val x = tmp.substring(it[0], it[1] + 1)
        tmp.replace(it[0], it[1] + 1, x.reversed())
    }
    println(tmp)
}

fun main() {
    val s = readLine()!!
    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val lr = Array(n) { readLine()!!.split(" ").map { it.toInt() - 1 } }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(s, n, lr)
}