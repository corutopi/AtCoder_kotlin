package ABC.at140

fun solve(n: Int){
    println(n * n * n)
}

fun main(){
    val n = readLine()!!.toInt()
    solve(n)
}