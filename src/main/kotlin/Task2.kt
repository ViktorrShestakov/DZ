fun main() {
    val a1= readln().toInt()
    val a2= readln().toInt()
    if (a1<a2){
        for (i in a1..a2) {
            println(i)
        }
    } else{
        for (i in a2..a1) {
            println(i)
        }
    }

}