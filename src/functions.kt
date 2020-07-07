/*fun printSum(){
    var a = 12
    var b = 33
    println("The sum is "+ (a+b))
}*/
//PARAMITIZED FUN
fun printSum(num1: Int, num2:Int): Int{
    return num1 + num2
}
fun main(args:Array<String>){
    val result = printSum(22, 56)
    print(result)
}
//The recursive call must be the last call of the method. To declare a recursion as tail recursion we need to use tailrec modifier before the recursive function.
/*
fun main(args: Array<String>) {
    var number = 1000.toLong()
    var result = recursiveSum(number)
    println("sun of upto $number number = $result")
}
tailrec fun recursiveSum(n: Long, semiresult: Long = 0) : Long {
    return if (n <= 0) {
        semiresult
    } else {
        recursiveSum( (n - 1), n+semiresult)
    }
}  */
//NAMED ARGUMENT
/*
fun main(args: Array<String>) {
    run(latter='a')
}
fun run(num:Int= 5, latter: Char ='x'){
    print("parameter in function definition $num and $latter")
}  */
//LAMBDA
//{s:Int -> print(s)}
//HIGHER ORDER FUNCS
/*fun myFun(org: String,portal: String, fn: (String,String) -> String): Unit {
    val result = fn(org,portal)
    println(result)
}

fun main(args: Array<String>){
    val fn:(String,String)->String={org,portal->"$org develop $portal"}
    myFun("sssit.org","javatpoint.com",fn)
}  */
//INLINE FUNCS
/*fun main(args: Array<String>) {
    inlineFunction({ println("calling inline functions")})
}

inline fun inlineFunction(myFun: () -> Unit ) {
    myFun()
    print("code inside inline function")
}  */

