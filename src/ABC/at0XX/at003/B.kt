package ABC.at0XX.at003

fun solveX(s: String, t: String) {
    val keyword = "atcoder@"
    for (i in s.indices) {
        if (s[i] == t[i]) continue
        if ((s[i] == '@' || t[i] == '@')
                && s[i] in keyword
                && t[i] in keyword) continue
        println("You will lose")
        return
    }
    println("You can win")
}

fun main() {
    val s = readLine()!!
    val t = readLine()!!
//    val n = readLine()!!.toInt()
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val a = readLine()!!.split(" ").map { it.toInt() }
    solveX(s, t)
}