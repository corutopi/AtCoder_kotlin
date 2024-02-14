package ABC.at1XX.at198

fun solveB(n: Int) {
    var t = n
    while (t % 10 == 0) {
        t /= 10
    }
    val tArr = t.toString().split("")
    for (i in 0..(tArr.count() - 1)) {
        if (tArr[i] != tArr[tArr.count() - 1 - i]) {
            println("No")
            return
        }
    }
    println("Yes")
}

fun main() {
//    val s = readLine()!!
    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveB(n)
}