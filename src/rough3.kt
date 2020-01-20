fun main(){
    val listOfVersesToID = mutableListOf<Pair<String, Int>>()

    prayers.forEach {
        listOfVersesToID.add(it.verse to it.id)
    }

    println(listOfVersesToID)
    println("\n")

    val groupedListByVerse = listOfVersesToID.groupBy { it.first }
    println(groupedListByVerse)
    println("\n")

    // Data Structure
    //
    // ids and categories tied to a scripture
    //
    // (scripture, (ids, categories))
    // e.g (John 3:16, ([1,5,7], [health, wealth, prosperity, glory]))
    val constructedList = mutableListOf<Pair<String, Pair<ArrayList<Int>, ArrayList<String>>>>()

    groupedListByVerse.forEach{
        val idArray = arrayListOf<Int>()
        val categoryArray = arrayListOf<String>()

        it.value.forEach {
            idArray.add(it.second)
            prayers[it.second -1].keyword.forEach {
                if(it !in categoryArray){
                    categoryArray.add(it)
                }
            }
        }

        constructedList.add(it.key to Pair(idArray, categoryArray))
    }

    println(constructedList)
    println("\n")

    constructedList.sortBy {
        it.second.first.size
    }

    println(constructedList.asReversed())
    println("\n")
}