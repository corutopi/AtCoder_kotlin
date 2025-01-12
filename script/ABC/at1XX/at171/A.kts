
fun solve(a: String) {
    println(if (Regex(pattern = "[A-Z]").containsMatchIn(a)) "A" else "a")
}

fun main() {
    val a = readLine()!!
    solve(a)
}