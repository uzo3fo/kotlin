//Set interface is a  generic unordered collection of elements
fun main(args:Array<String>){
    var tt = setOf<Any>(1, 3, "ali", "Simbi", 3)
    var rr: Set<String> = setOf<String>("3","Simbi", "obi")
    var ff: HashSet<Int> = hashSetOf<Int>(2,5,7,8,4,3)
    println(tt)
    println(tt.intersect(rr))
    println(tt.indexOf(3))
    println(rr.reversed())
    println(ff.sorted())
}