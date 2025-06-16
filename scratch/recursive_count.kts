val array = intArrayOf(-2, 1, 2, 3, 4, 7, 8, 9, -10)

fun count(arr: IntArray): Int {
    // Базовый случай
    if (arr.isEmpty()) {
        return 0
    }
    if (arr.size == 1) {
        return 1
    }

    // Рекурсивный случай
    return count(arr.copyOfRange(0, arr.size - 1)) + 1
}

println(count(array))
