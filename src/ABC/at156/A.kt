package ABC.at156

fun main() {
    val (n, r) = readLine()!!.split(" ").map { it.toInt() }
    if (n < 10){
        println(r + 100 * (10 - n))
    } else {
        println(r)
    }
}