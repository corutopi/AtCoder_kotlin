package ABC.at1XX.at139

fun solve(s: String, t: String){
    var ans = 0
    for ( i in 0..(s.count() - 1)) {
        if (s[i] == t[i]) {ans += 1}
    }
    println(ans)
}

fun main(){
    val s = readLine()!!
    val t = readLine()!!
    solve(s, t)
}