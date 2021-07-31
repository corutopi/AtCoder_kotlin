package ABC.at174

fun solve(x: Int){
    println(if (x >= 30) "Yes" else "No")
}

fun main() {
    val x = readLine()!!.toInt()
    solve(x)
}