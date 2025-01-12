

// https://qiita.com/k5n/items/cc0377b75d8537ef8a85
// https://qiita.com/opengl-8080/items/36351dca891b6d9c9687
fun main() {
    // 演算子

    // for文
    val a = "a b c".split(" ")
    a.forEach { element ->
        println(element)
    }
    for (a1 in a) {
        println(a1)
    }
    //// loop
    println("loop")
    for (i in 0..2) {
        println(i)
    }
    repeat(10) {
        println(it)
    }

    // if
    println(if (true) 'a' else 'b')

    // print
    println("""
        hoge
        hogera
        hogeraga

        hogeragon
    """.trimIndent())

    val b = Array(size = 5, init = { i -> i + 1 })
    println(b.joinToString())
    println(b.map { "hoge" })
    val c = (b.map { "hoge" })


    println("---about object--------")
    // get class name
    println(a.javaClass.simpleName)
    println(a)
    println(b.javaClass.simpleName)
    println(b)
    println(c.javaClass.simpleName)
    println(c)
    println()
    println()

    println("---about list--------")
    // 重複の削除
    val d = listOf(1, 2, 3, 1, 2, 3)
    println(d)
    val dd = d.distinct()
    println(dd)
    // 要素数
    println(d.count())
    println(d.count { it > 2 })
    // 特定の要素を抽出
    println(d.filter { it > 1 })
    println()
    println()


    println("---文字列操作--------")
    println("%s %d".format("文字列", 123))

}