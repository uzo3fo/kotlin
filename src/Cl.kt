class Cl(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

}
//All classes in Kotlin have a common superclass "ANY"
//class Don private constructor(){} --class with primary constructor
 //open class Base(){} --open for inheritance
//OVER-RIDING METHODS-- use the keyword open
/*
open class Shape {
    open fun draw() { */
/*...*//*
 }
    fun fill() { */
/*...*//*
 }
}

class Circle() : Shape() {
   final*/
/*prevent re-overriding*//*
 override fun draw() { */
/*...*//*
 }
}*/
open class Base{
    open fun draw(){println("This function can be accessed by a child class")}
}
class NotBase() : Base(){
    override fun draw() {
        super.draw()
        println("overridden using super ")
    }
}