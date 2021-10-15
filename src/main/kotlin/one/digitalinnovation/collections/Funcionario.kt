package one.digitalinnovation.collections

data class Funcionarios (
    val nome: String,
    val salario: Double,
    val tipocontratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()
}
