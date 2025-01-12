
fun main() {
    val x = readLine()!!.toInt()
    val c500 = x / 500
    val c5 = (x % 500) / 5
    println(c500 * 1000 + c5 * 5)
}