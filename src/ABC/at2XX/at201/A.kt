package ABC.at2XX.at201

fun solve(a: List<Int>) {
    val sort_a = a.sorted()
    println(if (sort_a[0] - sort_a[1] == sort_a[1] - sort_a[2]) "Yes"  else "No")
}

fun main() {
//    val s = readLine()!!
//    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    solve(a)
}