package ne.digitalinnovation.collections

fun main() {
    println("----forEach----")
    val values = intArrayOf(2, 3, 4, 1, 10, 7)
    values.forEach {
        println(it)
    }

    println("----sort..forEach----")
    values.sort()
    values.forEach {
        println(it)
    }
}