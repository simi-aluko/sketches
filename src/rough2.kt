fun main() {
    val list = listOf(
        "health" to 1,
        "prosperity" to 2,
        "glory" to 3,
        "grace" to 4,
        "health" to 5,
        "glory" to 6,
        "health" to 7
    )

    println(list)

    val groupedListByCategory = list.groupBy { it.first }
    println(groupedListByCategory)

    // Data Structure
    //
    // ids where that particular category can be found
    // occurence helps in determining top categories
    //
    // (category, (occurence, ids))
    // e.g (health, (3, [1, 5, 7]))
    val constructedList = mutableListOf<Pair<String, Pair<Int, ArrayList<Int>>>>()

    groupedListByCategory.forEach {
        val idArray = arrayListOf<Int>()

        it.value.forEach { idArray.add(it.second) }

        constructedList.add(it.key to Pair(it.value.size, idArray))
    }
    println(constructedList)

    constructedList.sortBy {
        it.second.first
    }

    println(constructedList.asReversed())
}