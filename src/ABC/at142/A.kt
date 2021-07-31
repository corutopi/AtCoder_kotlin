package ABC.at142

fun solve(n: Int){
    val dn = n.toDouble()
    println((n / 2 + n % 2).toDouble() / dn)
}

fun main(){
    val n = readLine()!!.toInt()
    solve(n)
}