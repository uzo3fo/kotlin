fun main(args:Array<String>){
   // var a = 17
    //IF-ELSE STATEMENT
   /* var b = 23
    val c = if(a < b){
        "$b is greater than $a"
    }else{
        "$a is greater than $b"
    }
    println(c)*/
    //WHEN STATEMENT (just like switch-case)
    /*when(a){
        5 ->println("five")
        10,11,12 -> println("not there yet")
        15 -> {
            println("Welcome")
            println("Good to go")
        }
        in 16..20-> println("Far from the truth")
        else -> println("What is wrong with you")
    }*/
    //FOR-LOOP
    //var results = arrayOf(80,91,98,96)
    //TO GET VALUES
   // for(result in results) println(result)
    //LOOP WITH INDICES
   // for(item in results.indices)println("result[$item]"+ results[item])
    //LOOP RANGES
    //for(i in 1..5)print(i)
    //for(i in 5 downTo 1)print(i)
    //for(i in 1..5 step 2)print(i)
    //WHILE LOOP
   /* var i = 1
    while(i <= 5){
        println(i)
        i++
    }*/
    /*for(i in 1 until 10){
        println(i)
    }*/
    //SEQUENCE
    val oddNumbersLessThan10 = generateSequence(1) { if (it < 10) it + 2 else null }
    println(oddNumbersLessThan10.count())
}