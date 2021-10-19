package one.digitalinnovation.collections

fun main() {
    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0,"PJ")
    val maria = Funcionarios("Maria", 4000.0,"CLT")
    val joana = Funcionarios("Joana", 2500.0,"PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println()
    funcionarios.add(joana) //Inclusão de novo funcionário
    funcionarios.forEach { println(it) }

    println()
    funcionarios.remove(joao) //Exclusão de um funcionário
    funcionarios.forEach { println(it) }

    println()
    val funcionarioSet = mutableSetOf(joao) //Função set pegar um funcionário e imprimir
    funcionarioSet.forEach { println(it)}

    println()
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it)}

    println()
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it)}
}