package one.digitalinnovation.collections

fun main() {
    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "PJ")
    val maria = Funcionarios("Maria", 4000.0, "CLT")
    val joana = Funcionarios("Joana", 2500.0, "PJ")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria, joana)

    val resultUnion = funcionarios1.union(funcionarios2) //União de conjuntos
    resultUnion.forEach { println(it) }

    println()
    val funcionarios3 = setOf(joao, pedro, maria, joana)
    val resultSubtract = funcionarios3.subtract(funcionarios2) //Subtração de conjuntos
    resultSubtract.forEach { println(it) }

    println()
    val resultIntersect = funcionarios3.intersect(funcionarios2) //Intersecção de conjuntos
    resultIntersect.forEach { println(it) }
}