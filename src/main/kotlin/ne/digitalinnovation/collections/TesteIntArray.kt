package ne.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("------for..in-------")
    for (valor in values) {
        println(valor)
    }

    println("------forEach-------")
    values.forEach {
        println(it)
    }

    println("------for..index..in-------")
    for(index in values.indices){
        println(values[index])
    }

    println("-----sort..for..in-----")
    values.sort()
    for (valor in values){
        println(valor)
    }
}