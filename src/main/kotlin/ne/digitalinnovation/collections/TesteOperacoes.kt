package ne.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.00, 2250.00, 4000.00)

    for (salario in salarios){
        println(salario)
    }

    println("----Menor-Média-Maior---")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.00 }
    println("----Maior que 2500,00----")
    salariosMaiorQue2500.forEach { println(it) }

    println("----Qtde entre 2000,00 e 5000,00----")
    println(salarios.count { it in 2000.00..5000.00 })

    println("----Igual a 2250,00/500,00----")
    println(salarios.find { it == 2250.00 })
    println(salarios.find { it == 500.00 })

    println("----Qualquer Igual a 1000,00/500,00----")
    println(salarios.any { it == 1000.00 })
    println(salarios.any { it == 500.00 })
}