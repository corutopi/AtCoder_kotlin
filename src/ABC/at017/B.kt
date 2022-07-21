package ABC.at017

fun solveX(x: String) {
    println(if (x.replace("ch", "")
                    .replace("o", "")
                    .replace("k", "")
                    .replace("u", "").equals("")) "YES" else "NO")
}

fun main() {
    val x = readLine()!!
    solveX(x)
}