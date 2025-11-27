fun main(){
    var n=0
    while (true){
        when(readln()){
            "increase"->n++
            "decrease"->n--
            "exit"->break
            else-> println("Ошибка! Команда не найдена")
        }
    }
    println(n)
}