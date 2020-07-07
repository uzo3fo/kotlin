/*
fun main(args:Array<String>){
    // generic ->    val stores: Map<Int, String> = mapOf<Int, String>()
    var maps = mapOf<Int, String>(1 to "uzor", 2 to "dapo", 3 to "david")
    */
/*for(key in maps.keys){
        println(maps[key])
    }*//*

    for(itr in maps.iterator()){
        println("${itr.key} -- ${itr.value}")
    }
    println(maps.minus(2))
    println(maps.plus(Pair(4, "hello")))
}*/
//HASH MAP
fun main(args:Array<String>){
    var maps = mapOf<Int, String>(1 to "uzor", 2 to "dapo", 3 to "david")
    var hash: HashMap<Int, String> = hashMapOf<Int, String>()
    var cash: HashMap<Int, String> = HashMap<Int, String>()
    hash.putAll(maps)
    cash.putAll(maps)
    println(cash)
    println(hash)
    /*println(hash.containsValue("dapo"))
    for(key in hash.keys){
        println("$key -- ${hash[key]}")
    }*/
    //hashMapOf is a function of HashMap it returns a new hashMap
}