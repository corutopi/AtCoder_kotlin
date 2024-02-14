package ABC.at1XX.at149

fun solve(s: String, t:String){
    println(t + s)
}

fun main() {
    val (s, t) = readLine()!!.split(" ")
    solve(s, t)
}