fun main(){

/*   20/01/2020

    val a = 1
    val b = 2

    val c = if (a > b) a else b  // c = b i.e. c = 2

    // last value in block is returned
    val d = if (b == c) {
        println(c)
        c                           // d = c i.e. d = 2
    }else{
        println(b)
        b                           // d = b i.e. d = 2
    }



    println(d)*/

    // 21/01/202

    val numberArray = arrayOf(1, 2, 3, 4, 5)

    println(5 in numberArray)    // true
    println(6 in numberArray)    // false



    val variable = "boy"

    val name = when(variable){
        "boy" -> "David"
        "girl" -> "Sarah"
        else -> "Alexis"
    }

    println(name)  // David


}