fun main() {
    /*val numbers = listOf("one", "two", "three", "four", "five")

    println(numbers.groupBy { it.first().toUpperCase() })
    println(numbers.groupBy(keySelector = { it.first() }, valueTransform = { it.toUpperCase() }))*/

    //USING GROUPING-BY
    /*val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.groupingBy { it.first() }.eachCount())*/
    /*val fruits = listOf("cherry", "blueberry", "citrus", "apple", "apricot", "banana", "coconut")
//FOLD
    val evenFruits = fruits.groupingBy { it.first() }
            .fold({ key, _ -> key to mutableListOf<String>() },
                    { _, accumulator, element ->
                        accumulator.also { (_, list) -> if (element.length % 2 == 0) list.add(element) }
                    })

    val sorted = evenFruits.values.sortedBy { it.first }
    println(sorted)*/
    //AGGREGATE
    val numbers = listOf(3, 4, 5, 6, 7, 8, 9)

    val aggregated = numbers.groupingBy { it % 3 }.aggregate { key, accumulator: StringBuilder?, element, first ->
        if (first) // first element
            StringBuilder().append(key).append(":").append(element)
        else
            accumulator!!.append("-").append(element)
    }

    println(aggregated.values)
}