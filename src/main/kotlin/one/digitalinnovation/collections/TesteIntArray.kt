package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values [0] = 1
    values [1] = 7
    values [2] = 6
    values [3] = 3
    values [4] = 2

    for (valor in values) {
        println(valor)
    }
    println()
    // outra maneira de fazer utilizando lámbida
    // pode substituir 'it' por 'valor ->'
    values.forEach {
        println(it)
    }
    println()
    // outra maneira passando o indice
    for (index in values.indices){
        println(values[index])
    }
    println()
    // Desta maneira ordena os números do menor para o maior
    values.sort()
    for (valor in values)
        println(valor)

}