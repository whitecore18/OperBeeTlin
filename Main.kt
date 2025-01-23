fun main() {
    // t1
    val inputList = listOf("one", "two", "three")
    val reversedList = inputList.map { it.reversed() }
    println("Реверсированные строки: $reversedList")

    // t2
    val numbersList = listOf(1, 2, 3, 4, 5)
    val squaredList = numbersList.filter { it <= 3 }.map { it * it }
    println("Квадраты элементов, меньше или равных 3: $squaredList") // [1, 4, 9]

    // t3
    val englishColors = listOf("red", "blue", "white")
    val russianColors = listOf("красный", "синий", "белый")
    val combinedList = mutableListOf<String>()

    for (i in englishColors.indices) {
        combinedList.add("Значение: ${englishColors[i]}, перевод: ${russianColors[i]}")
    }
    println("Объединенные списки цветов: $combinedList")

    // t4
    val months = listOf("Jan", "Feb", "Mar", "Apr", "May")
    val totalCharacters = months.sumOf { it.length }
    println("Общее количество символов в названиях месяцев: $totalCharacters")
}