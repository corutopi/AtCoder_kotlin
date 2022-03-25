package ABC.at001

fun solveX(m: Int) {
    when {
        m < 100 -> {
            println("00")
        }
        m in 100..5000 -> {
            println((m * 10 / 1000).toString().padStart(2, '0'))
        }
        m in 6000..30000 -> {
            println((m / 1000 + 50).toString().padStart(2, '0'))
        }
        m in 35000..70000 -> {
            println(((m / 1000 - 30) / 5 + 80).toString().padStart(2, '0'))
        }
        70000 < m -> {
            println("89")
        }
    }
}

fun main() {
//    val s = readLine()!!
    val m = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(m)
}