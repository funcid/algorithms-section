val graph = mapOf(
    "Москва" to listOf("Сингапур", "Дубай"),
    "Сингапур" to listOf("Токио", "Пхукет", "Шанхай"),
    "Дубай" to listOf("Тель-Авив"),
    "Тель-Авив" to listOf("Шанхай"),
    "Токио" to listOf(),
    "Шанхай" to listOf(),
    "Пхукет" to listOf()
)

typealias Way = Pair<String, Int>

fun search(
    root: String,
    target: String,
    choicer: (deq: ArrayDeque<Way>) -> Way
): Int {
    val queue = ArrayDeque<Way>()
    queue.add(root to 0)

    while (!queue.isEmpty()) {
        val (curr, depth) = choicer(queue)

        if (curr == target) {
            return depth
        }

        queue.addAll(
            graph[curr].orEmpty().map { it to depth + 1 }
        )
    }

    return -1
}

fun bfs(root: String, target: String) = search(root, target) { it -> it.removeFirst() }
fun dfs(root: String, target: String) = search(root, target) { it -> it.removeLast() }

println(bfs("Москва", "Шанхай")) // поиск в ширину найдет ближайший путь
println(dfs("Москва", "Шанхай")) // поиск в глубину найдет путь