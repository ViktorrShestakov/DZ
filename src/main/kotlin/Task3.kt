fun main() {
    val list = listOf(1, -1, 5, -6, -8, 15, 2, 5, -4)
    var sum = 0
    for (i in list) {
        if (i > 0) {
            sum += i
        }
    }
    println(sum)
}