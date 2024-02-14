package ABC.at1XX.at167


fun main() {
    val S = readLine()!!
    val T = readLine()!!

    if (S == T.substring(0..T.length - 2)) {
        println("Yes")
    } else {
        println("No")
    }
}