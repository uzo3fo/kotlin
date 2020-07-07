fun main(){
    //MAPPING COLLECTION

   /* var num = setOf(2,4,6,8)
    println(num.map{it*2})
    println(num.mapIndexed{Idx, value -> Idx*value})*/

    //MAPPING AND IGNORING NULL

    //mapNotNull
    //mapIndexedNotNull
    /*val numbers = setOf(1, 2, 3)
    println(numbers.mapNotNull { if ( it == 2) null else it * 3 })
    println(numbers.mapIndexedNotNull { idx, value -> if (idx == 0) null else value * idx })*/

    //MAPPING MAPS

    //val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    //println(numbersMap.mapKeys { it.key.toUpperCase() })
   //println(numbersMap.mapValues { it.value + it.key.length })

    //ZIPPING

    /*val colors = listOf("red", "brown", "grey")
    //val animals = listOf("fox", "bear", "wolf")
    //println(colors zip animals)
    val twoAnimals = listOf("fox", "bear")
    println(colors.zip(twoAnimals){color, animal -> "The ${animal.capitalize()} is $color"})*/

    /*//UNZIPPING
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs.unzip())*/

    //ASSOCIATION

    /*val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })*/
   // val numbers = listOf("one", "two", "three", "four")
    //println(numbers.associateBy { it.last().toUpperCase() })
    //println(numbers.associateBy(keySelector = { it.first().toUpperCase() }, valueTransform = { it.length }))

    //FLATTENING
    /*val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
    println(numberSets.flatten())*/
    /*data class StringContainer(val values: List<String>)
    val containers = listOf(
            StringContainer(listOf("one", "two", "three")),
            StringContainer(listOf("four", "five", "six")),
            StringContainer(listOf("seven", "eight"))
    )
    println(containers.flatMap { it.values })*/

    //STRING REPRESENTATION
    /*val numbers = listOf("one", "two", "three", "four")

    //println(numbers)
   // println(numbers.joinToString())
    val listString = StringBuffer("The list of numbers: ")
    numbers.joinTo(listString)
    println(listString)*/
    /*val numbers = listOf("one", "two", "three", "four")
    println(numbers.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))*/
    /*val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 10, truncated = "<...>"))*/
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.joinToString { "Element: ${it.toUpperCase()}"})
}