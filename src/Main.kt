fun main() {
    // 1 часть
    var helloWorld: String
    val NUM: Int = 0
    var word: String = "6"
    helloWorld = word + NUM
    println(helloWorld + NUM + word)

    if (NUM < 0) {
        println("Вы сохранили отрицательное число")
    } else if (NUM > 0) {
        println("Вы сохранили сохранили положительное число")
    } else {
        println("    Вы сохранили ноль")
    }
}