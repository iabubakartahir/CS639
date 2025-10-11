// lesson1.kts — Kotlin Basics (enhanced)
// Demonstrates: vals/vars, string templates, null-safety, Elvis, safe-call, ranges, loops, conditionals, collections

// immutable vs mutable
val appName: String = "CS639 Kotlin Pathway"
var version = 1

println("Welcome to $appName v$version")

// String templates & expressions
val a = 7
val b = 5
println("a + b = ${a + b}")

// Null-safety: safe call + Elvis
val maybe: String? = null
val length = maybe?.length ?: -1
println("Null-safe length = $length")

// Ranges & loops
for (i in 1..5) print("$i ")
println()

// Conditionals
val score = 92
val grade = if (score >= 90) "A" else "B"
println("Grade: $grade")

// Collections (ArrayList + List ops)
val list = arrayListOf(1, 2, 3)
list.add(4)
println("List: $list size=${list.size}")
val doubled = list.map { it * 2 }
println("Doubled: $doubled")

// Extra: small function for clarity
fun greet(name: String) = println("Hello, $name!")
greet("Abubakar")

version += 1
println("Goodbye from $appName v$version")
