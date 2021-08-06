package ABC.at117

fun solve(t: Int, x: Int){
    println(t.toDouble() / x)
}

fun main(){
    val (t, x) = readLine()!!.split(" ").map { it.toInt() }
    solve(t, x)
}