val array = intArrayOf(-2, 1, 2, 3, 4, 7, 8, 9, -10)

fun sum(arr: IntArray): Int {
    // Базовый случай
    if (arr.isEmpty()) {
        return 0
    }
    if (arr.size == 1) {
        return arr[0]
    }

    // Рекурсивный случай
    return sum(arr.copyOfRange(0, arr.size - 1)) + arr[arr.size - 1]
}

println(sum(array))
