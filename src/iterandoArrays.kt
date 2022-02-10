public fun iterandoArrays() {
    val salarios: DoubleArray = doubleArrayOf(1500.0, 3000.0, 5000.0, 8000.0, 10000.0)
    println("Salarios sem aumento: ${salarios.contentToString()}")
    val aumento = 1.1
    salarios.forEachIndexed() { i, salario ->
        salarios[i] = salario * aumento
    }

    println("Salarios com aumento de 10%: ${salarios.contentToString()}")
}