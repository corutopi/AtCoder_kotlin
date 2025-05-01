
fun solveX(n: Int, q: Int, query: Array<List<Any>>) {
    val queue = ArrayDeque((1..n).map { listOf(it, 0) })
    query.forEach {
        if (it[0] == 1) {
            queue.removeLast()
            val f = queue.first()
            queue.addFirst(
                when (it[1]) {
                    "U" -> listOf(f[0], f[1] + 1)
                    "D" -> listOf(f[0], f[1] - 1)
                    "L" -> listOf(f[0] - 1, f[1])
                    "R" -> listOf(f[0] + 1, f[1])
                    else -> listOf()
                }
            )
        } else {
            val t = it[1]
            if (t is Int) {
                println(queue[t - 1].joinToString(" "))
            }
        }
    }
}

fun main() {
    val (n, q) = readLine()!!.split(" ").map { it.toInt() }
    val query: Array<List<Any>> = Array(q) { readLine()!!.split(" ").map { it.toIntOrNull() ?: it } }
    solveX(n, q, query)
}

main()