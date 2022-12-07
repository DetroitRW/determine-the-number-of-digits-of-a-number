import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Введите число: ")
    val n = reader.nextInt()

    print("Количество разрядов: ${discharges(n)}" )

}

fun discharges(n: Int): Int {
    if (n == 0) {return 0}
    return discharges(n / 10) + 1
}