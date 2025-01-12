

fun main() {
    val n = readLine()!!.toInt()

    (0 until n).map {
        val (s, p) = readLine()!!.split(" ")
        Triple(it + 1, s, p.toInt())
    }.sortedWith(Comparator { o1, o2 ->
        if (o1.second != o2.second)
            o1.second.compareTo(o2.second)
        else
            o2.third.compareTo(o1.third)
    }).forEach { println(it.first) }
}