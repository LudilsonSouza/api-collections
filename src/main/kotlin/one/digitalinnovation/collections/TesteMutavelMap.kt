package one.digitalinnovation.collections

fun main() {
    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0,"PJ")
    val maria = Funcionarios("Maria", 4000.0,"CLT")
    val joana = Funcionarios("Joana", 2500.0,"PJ")

    val repositorio = Repositorio<Funcionarios>()

    repositorio.create(joao.nome, joao)
    repositorio.create(joana.nome, joana)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findByid(joao.nome))

    println()
    repositorio.findAll().forEach { println(it) }

    println()
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }

}