package ABC.at1XX.at153

fun solve(H:Int, N:Int, As:List<Int>) {
    var ans = "No"
    if (As.sum() >= H) {
        ans = "Yes"
    }
    println(ans)
}

fun main() {
//    val S = readLine()!!
//    val N = readLine()!!.toInt()
    val (H, N) = readLine()!!.split(" ").map { it.toInt() }
    val As = readLine()!!.split(" ").map { it.toInt() }
    solve(H, N, As)
}