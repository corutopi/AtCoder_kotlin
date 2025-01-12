
fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val s = IntArray(m)
    val c = IntArray(m)
    repeat(m) {i ->
        val (r1, r2) = readLine()!!.split(" ").map { it.toInt() }
        s[i] = r1
        c[i] = r2
    }

    var ans = -1
    for (i in 0..Math.pow(10.0, n.toDouble()).toInt()){
        val sa = i.toString().split("").filter { it != "" }
        var flg = true

        for (j in 0..(m - 1)) {
            if (sa.size < s[j]) {
                flg = false
                break
            } else if (sa[s[j] - 1].toInt() != c[j]) {
                flg = false
                break
            }

        }
        if (flg && i.toString().length == n) {
            ans = i
            break
        }
    }

    println(ans)
}