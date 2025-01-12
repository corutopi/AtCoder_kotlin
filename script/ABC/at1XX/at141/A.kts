
fun solve(s: String){
    when (s){
        "Sunny" -> println("Cloudy")
        "Cloudy" -> println("Rainy")
        "Rainy" -> println("Sunny")
    }
}

fun main(){
    val s = readLine()!!
    solve(s)
}