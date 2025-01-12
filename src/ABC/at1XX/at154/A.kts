
fun solve(S: String, T: String, A: Int, B: Int, U: String) {
    var a = A
    var b = B
    if(S == U){
        a -= 1
    } else {
        b -= 1
    }
    println("%d %d".format(a, b))
}

fun main() {
//    val S = readLine()!!
//    val N = readLine()!!.toInt()
    val (S, T) = readLine()!!.split(" ")
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    val U = readLine()!!
//    val A = readLine()!!.split(" ").map { it.toInt() }
    solve(S, T, A, B, U)
}