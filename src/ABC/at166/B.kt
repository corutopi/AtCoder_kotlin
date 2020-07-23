package ABC.at166

fun main() {
    val (N, K) = readLine()!!.split(' ').map(String::toInt)
    val list = IntArray(N)

    repeat(K) {
        readLine()!!
        val x = readLine()!!.split(" ").map { it.toInt() - 1 }
        x.forEach {
            list[it]++
        }
    }

    println(list.filter { it == 0 }.count())
}