package ABC.at157


fun solve(A: List<List<Int>>, N: Int ,B: List<Int>) {
    val bingo = (0 until 3).map { IntArray(3) }

    // do
    B.forEach { b ->
        repeat(3 ){ i ->
            repeat(3) {j ->
                if (A[i][j] == b) {
                    bingo[i][j] = 1
                }
            }
        }
    }

    // check
    var ans = "No"
    /// horizon
    for (i in 0..2) {
        if (bingo[i].sum() == 3) {
            ans = "Yes"
        }
    }
    /// vertical
    for (j in 0..2) {
        var flg = true
        for (i in 0..2) {
            if (bingo[i][j] == 0) {
                flg = false
                break
            }
        }
        if (flg) {
            ans = "Yes"
        }
    }
    /// cross
    var x = 0
    for (i in 0..2) {
        x += bingo[i][i]
    }
    if (x == 3) {
        ans = "Yes"
    }
    x = 0
    for (i in 0..2) {
        x += bingo[i][2 - i]
    }
    if (x == 3) {
        ans = "Yes"
    }

    println(ans)
}

fun main() {
//    val S = readLine()!!
//    val N = readLine()!!.toInt()
//    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
//    val A = readLine()!!.split(" ").map { it.toInt() }
    val A = (0 until 3).map { readLine()!!.split(' ').map { it.toInt() } }
    val N = readLine()!!.toInt()
    val B = (0 until N).map { readLine()!!.toInt() }
    solve(A, N ,B)
}