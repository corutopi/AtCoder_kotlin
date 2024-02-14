package ABC.at1XX.at143

fun solve(a:Int, b:Int){
    println(Math.max(a - (b * 2), 0))

}

fun main(){
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    solve(a, b)
}