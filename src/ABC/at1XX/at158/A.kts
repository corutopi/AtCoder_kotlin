
fun solve(S: String) {
    val s = S.split("")
    var ans = "No"
    for (i in 1..2){
        if (s[i] != s[i + 1]) {
            ans = "Yes"
            break
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