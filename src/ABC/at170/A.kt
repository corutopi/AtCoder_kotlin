package ABC.at170

fun solve(x: List<Int>) {
    for (i in 0..x.count()) {
        if (x[i] == 0) {
            print(i + 1)
            break
        }
    }
}

fun main() {
    val x = readLine()!!.split(" ").map { it.toInt() }.toList()
    solve(x)
}