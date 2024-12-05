fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    // This is where the unexpected behavior may occur
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    map.removeIf { it.key % 2 == 0 }
    println(map) // Output: {1=one, 3=three, 5=five} 
}