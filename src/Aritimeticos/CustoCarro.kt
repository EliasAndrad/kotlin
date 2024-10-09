package Aritimeticos

// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
//seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
//calcular e escrever o custo final ao consumidor

fun main(){
    custo()
}

fun custo(){

    println("Qual custo de fabrica do carro?")
    var custoDefabrica = readlnOrNull()?.toDoubleOrNull()?: run {
        println("valor invalido")
        return
    }

    var custoDistribuidor = custoDefabrica * 0.28
    var custoDeImpostos = custoDefabrica * 0.45

    val valorFinal = custoDefabrica + custoDeImpostos + custoDistribuidor

    println("O custo final do carro ao consumidor será: R$ ${"%.3f".format(valorFinal)}")

}