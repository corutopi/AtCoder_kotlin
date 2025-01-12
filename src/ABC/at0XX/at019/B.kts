
fun solveX(s: String) {
    val tmp_s = s + "X"
    var ans = ""
    var cnt = 0
    for (i in 0 until tmp_s.length) {
        if ((i == 0) || (tmp_s[i] == tmp_s[i - 1])) {
            cnt += 1
        } else {
            ans += tmp_s[i - 1] + cnt.toString()
            cnt = 1
        }
    }
    println(ans)
}

fun main() {
    val s = readLine()!!
    solveX(s)
}