package ABC.at147

fun solve(a: List<Int>){
    println(if (a.sum() >= 22) "bust" else "win")
}

fun main() {
    val a = readLine()!!.split(" ").map { it.toInt() }.toList()
    solve(a)
}