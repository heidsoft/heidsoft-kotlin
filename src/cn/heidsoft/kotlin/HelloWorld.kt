package cn.heidsoft.kotlin

/**
 * For Kotlin versions earlier than 1.3 the
 * main function must be defined with a parameter
 */
fun main(array: Array<String>){
    println("hello world")

    printMessage(message = "hello world")

    printMessageWithPrefix("hello","world")

    println(sum(1,2))
}

/**
 * Unit: Unit in Kotlin corresponds to the void in Java. Like void,
 * Unit is the return type of any function that does not return any meaningful value,
 * and it is optional to mention the Unit as the return type.
 * But unlike void, Unit is a real class (Singleton) with only one instance.
 */
fun printMessage(message: String): Unit {                               // 1
    println(message)
}

/**
 * 参数可选
 * Create a function that takes a second optional parameter with default value "Info".
 * Also return Unit, which can be omitted.
 */
fun printMessageWithPrefix(message: String, prefix : String = "Info") { // 2
    println("[$prefix] $message")
}

/**
 * Create a function that returns an integer.
 */
fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y