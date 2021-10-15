package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }
    println()
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${salarios.average()}")

    val salariosmaiorque = salarios.filter { it > 2200.0}
    println()
    salariosmaiorque.forEach { println(it) }

    println()
    println(salarios.count {it in 2000.0..5000.0})

    println()
    println(salarios.find {it == 2250.0}) //retorna o valor do elemento igual ou null
    println(salarios.find {it == 2200.0})

    println()
    println(salarios.any{it == 1000.0}) //retorna true ou false
}