fun main(){
    var n=0
    var stroka= readln()
    while (stroka!="exit"){
        when(stroka){
            "increase"->n++
            "decrease"->n--
            else-> println("Ошибка! Команда не найдена")
        }
        stroka= readln()
    }
    println(n)
}