fun testaArrays() {
    //Ao criar o array o tamanho dele precisa ser definido, mas existe uma forma mais prática
//    val idades = IntArray(4)
    //forma mais pratica
    val idades = intArrayOf(25, 19, 33, 40, 54)
//    idades[0] = 25
//    idades[1] = 54
//    idades[2] = 33
//    idades[3] = 20

    var maiorIdade = 0
    for (idade in idades) {

        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    // funcao forEach dos arrays para fazer um loop para cada elemento do array, dentro do forEach também pode ser passada uma funcao criada separadamente
    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(maiorIdade)
    println(menorIdade)

//    //jeito dificil de conseguir a maior idade entre as 4 idades
//    var idade1 = 25
//    var idade2 = 54
//    var idade3 = 33
//    var idade4 = 20
//
//    val idade = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
//        idade1
//    } else if (idade2 > idade3 && idade2 > idade4) {
//        idade2
//    } else if (idade3 > idade4) {
//        idade3
//    } else {
//        idade4
//    }
}