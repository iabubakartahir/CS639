// lesson3.kt — Classes & Objects (enhanced)
// Demonstrates: open classes, inheritance, interfaces, data class features,
// companion object, init blocks, secondary constructor, extension func, copy/equals/hashCode, destructuring

// Interface
interface Printable {
    fun pretty(): String
}

// Open base class (can be subclassed)
open class Book(val title: String, val author: String) : Printable {
    // init block
    init {
        require(title.isNotBlank()) { "Title must not be blank" }
    }

    // open function can be overridden
    open fun category(): String = "General"

    override fun pretty(): String = "\"$title\" by $author"

    // companion object for factory/utilities
    companion object {
        fun fromPair(pair: Pair<String, String>) = Book(pair.first, pair.second)
    }
}

// Subclass
class TextBook(title: String, author: String, val subject: String) : Book(title, author) {
    override fun category(): String = "Textbook: $subject"
}

// Data class automatically provides equals, hashCode, toString, copy, componentN
data class User(val name: String, var age: Int) : Printable {
    // Secondary constructor example
    constructor(name: String) : this(name, 0)

    override fun pretty(): String = "User(name=$name, age=$age)"
}

// Extension function on Book
fun Book.summary(): String = "Book: ${this.title} by ${this.author} [${this.category()}]"

fun main() {
    val b1 = Book("Kotlin 101", "JetBrains")
    val tb = TextBook("Kotlin for Android", "JetBrains", "Mobile")
    println(b1.summary())
    println(tb.summary())

    // Use companion factory
    val b2 = Book.fromPair("Effective Kotlin" to "Marcin Moskala")
    println(b2.pretty())

    // Data class goodies
    val u1 = User("Abubakar", 25)
    val u2 = u1.copy(age = 26)
    println(u1)          // toString auto
    println("u1 == u2? ${u1 == u2}")
    val (n, a) = u2      // destructuring via componentN
    println("Destructured -> name=$n age=$a")

    // Interface polymorphism
    val items: List<Printable> = listOf(b1, tb, u1)
    items.forEach { println("Printable: ${it.pretty()}") }
}
