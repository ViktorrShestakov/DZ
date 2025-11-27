fun main() {
    println("Приветствую, игрок!")
    println("Выберите чисто от 1 до 3:")
    val choice = readln().toInt()
    if (choice !in 1..3){
        println("Ошибка! Нужно выбрать число от 1 до 3!")
        return
    }
    println("Введите ставку:")
    val win = (1..3).random()
    val bet = readln().toInt()
    if (choice == win) {
        println("Ты победил! Вот твои ${bet * 3}")
    } else {
        println("Извини но нет. Правильное число $win. Ты проиграл :(")
    }
}