
fun solve(n: Int){
    println(if (n % 2 == 0) "White" else "Black")
}

fun main() {
    val n = readLine()!!.toInt()
    solve(n)
}