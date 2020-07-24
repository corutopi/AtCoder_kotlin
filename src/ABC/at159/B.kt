package ABC.at159



fun solve(S: String) {
    val s = S.split("")
    val n = S.length
    var ans = "Yes"
    for (i in 1..(n - 1) / 2) {
//        println(i.toString() + " " + s[i])
//        println(((n - 1) / 2 - i + 1).toString() + " " + s[(n - 1) / 2 - i + 1])
//        println((i + ((n - 1) / 2 + 1)).toString() + " " + s[i + ((n - 1) / 2 + 1)])
//        println()
        if (s[i] != s[(n - 1) / 2 - i + 1] || s[i] != s[i + ((n - 1) / 2 + 1)]) {
            ans = "No"
            //break
        }
    }
    println(ans)
}

fun main() {
    val S = readLine()!!
//    val N = readLine()!!.toInt()
//    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(S)
}