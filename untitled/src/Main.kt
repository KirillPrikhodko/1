import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        try {
            println("Введите первое число: ")
            val num1 = scanner.nextDouble()
            println("Введите второе число: ")
            val num2 = scanner.nextDouble()
            println("Введите операцию (+, -, *, /): ")
            val operation = readLine()
            val result = calculate(num1, num2, operation)
            println("Результат: $result")
        } catch (e: Exception) {
            println("Ошибка: ${e.message}")
        }
        print("Желаете повторить? (да/нет): ")
        val repeat = scanner.next()
        if (repeat.toLowerCase() != "да") {
            break
        }
    }
}

fun calculate(num1: Double, num2: Double, operation: String?): Double {
    return when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else throw ArithmeticException("Деление на ноль!")
        else -> throw IllegalArgumentException("Неверная операция!")
    }
}