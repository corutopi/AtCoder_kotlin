package ABC.at1XX.at155

fun solve(ABC: List<Int>) {
    val abc = ABC.distinct()
    if (abc.count() == 2) {
        println("Yes")
    } else {
        println("No")
    }
}

fun main() {
//    val S = readLine()!!
//    val N = readLine()!!.toInt()
//    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val ABC = readLine()!!.split(" ").map { it.toInt() }
    solve(ABC)
}