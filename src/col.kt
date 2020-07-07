/*
fun main(args:Array<String>){
    var list = listOf<Any>(1, 5, "ali", "simbi")
    println(list.shuffled())
}*/
/*
fun main(args:Array<String>){
    var mutable = mutableListOf<Int>(1,4,6,78,9)
    var ans = mutable.sort()
    println(ans)
}*/
fun main(args:Array<String>){
    var arrayList = ArrayList<String>();
    arrayList.add("kc")
    arrayList.add("chibuzor")
    arrayList.add("obrien")
    arrayList.add("micheal")
    arrayList.add("dapo")
    println(arrayList)
    println(arrayList.set(2, "decagon"))
    println(arrayList)
    println(arrayList.shuffled())
    println(arrayList.toString())
    var it = arrayList.iterator()
    /*while(it.hasNext()){
        println(it.next())
    }*/
    //arrayListOf<>() is a function of ArrayList returns an arrayList
    val list: ArrayList<String> = arrayListOf<String>()

}