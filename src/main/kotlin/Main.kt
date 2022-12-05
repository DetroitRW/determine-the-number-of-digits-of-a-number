import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Введите число: ")
    val n = reader.nextInt()

    print("Количество разрядов: ${discharges(n)}" )

}

fun discharges(n: Int): Int {
    var i = 0
    var m = n

    while (m > 0) {
        m /= 10
        i += 1
    }
    return i
}