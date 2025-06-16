val array = intArrayOf(-2, 1, 2, 3, 4, 7, 8, 9, -10)

fun max(arr: IntArray): Int {
    // Базовый случай
    if (arr.isEmpty()) {
        return Int.MIN_VALUE
    }
    if (arr.size == 1) {
        return arr[0]
    }
    // Рекурсивный случай
    return Math.max(max(arr.copyOfRange(0, arr.size - 1)), arr.last())
}

println(max(array))
