package ABC.at0XX.at018

fun solveX() {

}

fun main() {
    val t = MutableList(3) { readLine()!!.toInt() to it + 1 }
    t.sortBy { it.first }
    t.reverse()
    val ans = MutableList(3) { t[it].second to it + 1 }
    ans.sortBy { it.first }
    ans.forEach {
        println(it.second)
    }

    solveX()
}