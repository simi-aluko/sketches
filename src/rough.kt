fun main(){
    val array = arrayListOf<String>("health", "prosperity", "glory", "grace", "health", "glory", "health")

    val newArray = array.groupBy({it})
    println(newArray)

    val newMap = mutableMapOf<String, Int>()

    newArray.forEach {
        newMap[it.key] = it.value.size
    }

    println(newMap.toList().sortedBy {
        it.second
    }.reversed().toMap())

    println(newMap.toList())


//    println(newMap.toSortedMap(reverseOrder()))



    val test = arrayOf(1,2,3)
    if (1 in test) println("\n there")
    if(5 !in test) println("\n not there")

}