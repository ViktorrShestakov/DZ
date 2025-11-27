abstract class Animal(val name: String, val age: Int, val color: String) {
    abstract fun makeSound()
    fun printInfo(){
        println("Имя: $name, Возраст: $age, Цвет: $color")
    }
}
class Dog(name: String,age: Int,color: String):Animal(name,age,color){
    override fun makeSound() {
        println("Гав!")
    }
    fun guard(){
        println("$name охраняет дом")
    }

}
class Cat(name: String,age: Int,color: String):Animal(name,age,color){
    override fun makeSound() {
        println("Мяу!")
    }
    fun sleepAllDay(){
        println("$name спит весь день")
    }

}
class Mouse(name: String,age: Int,color: String):Animal(name,age,color){
    override fun makeSound() {
        println("Пи-пи!")
    }
    fun gnaw(){
        println("$name что-то грызет")
    }

}
fun main(){
    val dog1:Dog=Dog("Шарик",6,"коричневый")
    val cat1:Cat=Cat("Мурка",10,"белая")
    val mouse1:Mouse=Mouse("Уголёк",2,"чёрная")
    val dog2:Animal=Dog("Бобик",14,"чёрно-белый")
    val cat2:Animal=Cat("Писюн",5,"лысый")
    val mouse2:Animal=Mouse("Грэй",1,"серый")
    dog1.printInfo()
    dog1.makeSound()
    dog1.guard()
    cat1.printInfo()
    cat1.makeSound()
    cat1.sleepAllDay()
    mouse1.printInfo()
    mouse1.makeSound()
    mouse1.gnaw()
    dog2.printInfo()
    dog2.makeSound()
    cat2.printInfo()
    cat2.makeSound()
    mouse2.printInfo()
    mouse2.makeSound()
    // Без проверки на принадлежность личные методы работать не будут окак
    if (dog2 is Dog){
        dog2.guard()
    }
    if (cat2 is Cat){
        cat2.sleepAllDay()
    }
    if (mouse2 is Mouse){
        mouse2.gnaw()
    }
    // А вот так будут
}