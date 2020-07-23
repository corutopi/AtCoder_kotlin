package ABC.at160

fun main() {
    val s = readLine()!!.split("")
    var ans = "No"
    if (s[3] == s[4] && s[5] == s[6]) {
        ans = "Yes"
    }
    println(ans)
}