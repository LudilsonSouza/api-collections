package one.digitalinnovation.collections

fun main() {
    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0,"PJ")
    val maria = Funcionarios("Maria", 4000.0,"CLT")
    val joana = Funcionarios("Joana", 2500.0,"PJ")

    val funcionarios = listOf(joao, pedro, maria, joana)

    funcionarios.forEach { println(it) } //Imprime todos os funcionários

    println()
    println(funcionarios.find { it.nome == "Maria" }) //Imprime somente a Maria
    println()
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }
    println()
    funcionarios
        .groupBy { it.tipocontratacao } //Agrupamento
        .forEach { println(it) }
}
