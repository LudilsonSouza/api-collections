package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0) //Par de chaves
    val map1= mapOf(pair) // Mapa de chaves com seus valores

    map1.forEach { (k, v)-> println("Chave: $k = Valor: $v") }

    val map2 = mapOf (
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )

    map2.forEach { (k, v)-> println("Chave: $k = Valor: $v") }
}