val array = intArrayOf(-2, 1, 2, 3, 4, 7, 8, 9, -10)

fun quicksort(arr: IntArray): IntArray {
    // Базовый случай
    if (arr.size <= 1) {
        return arr
    }

    // Рекурсивный случай
    val pivot = arr[arr.size / 2]

    val less = arr.filter { it < pivot }.toIntArray()
    val greater = arr.filter { it > pivot }.toIntArray()

    return quicksort(less) + pivot + quicksort(greater)
}

println(quicksort(array).contentToString())
