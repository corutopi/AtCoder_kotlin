package ABC.at122


fun solve(S: String) {
    val atcgMap = mutableMapOf("A" to "T","T" to "A","C" to "G","G" to "C")
    println(atcgMap[S])
//    var ans = ""
//    if (S == "A") {
//        ans = "T"
//    } else if (S == "T") {
//        ans = "A"
//    } else if (S == "C") {
//        ans = "G"
//    } else if (S == "G") {
//        ans = "C"
//    }
//    println(ans)
}

fun main() {
    val S = readLine()!!
//    val N = readLine()!!.toInt()
//    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(S)
}