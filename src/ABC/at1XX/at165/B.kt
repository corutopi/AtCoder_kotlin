package ABC.at1XX.at165

fun main() {
    val x = readLine()!!.toLong()
    var ans = 0
    var money = 100L  // 型を合わせておかないと時間がかかる
    while (money < x) {
        ans++
        money += money / 100
    }
    println(ans)
}