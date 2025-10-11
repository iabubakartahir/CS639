// lesson2.kt — Functions (enhanced)
// Demonstrates: top-level functions, Unit, default & named args, overloading,
// higher-order functions, lambdas, function references, when

// Basic function with Unit
fun greet(name: String): Unit {
    println("Hello, $name!")
}

// Default & named arguments
fun area(width: Int = 1, height: Int = 1): Int = width * height

// Overloading
fun area(side: Int): Int = side * side

// Higher-order function: takes a function argument
fun applyOp(x: Int, y: Int, op: (Int, Int) -> Int): Int = op(x, y)

// Function reference
fun add(x: Int, y: Int): Int = x + y

// Lambda utilities
val multiply = { a: Int, b: Int -> a * b }

fun classifier(n: Int): String = when (n) {
    0 -> "zero"
    in 1..9 -> "one-digit"
    in 10..99 -> "two-digit"
    else -> "many digits"
}

fun main() {
    greet("Abubakar")

    println("Area default: ${area()}")
    println("Area named args: ${area(height = 3, width = 5)}")
    println("Area square overload: ${area(6)}")

    println("applyOp(add ref) = ${applyOp(5, 3, ::add)}")
    println("applyOp(lambda)  = ${applyOp(5, 3, multiply)}")
    println("applyOp(inline)  = ${applyOp(5, 3) { x, y -> x - y }}")

    for (n in listOf(0, 5, 23, 124)) {
        println("$n is ${classifier(n)}")
    }
}
