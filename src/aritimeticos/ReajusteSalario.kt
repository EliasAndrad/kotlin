//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário.

package aritimeticos

fun main(){
    reajusteSalario()
}

fun reajusteSalario(){

    print("Qual salario atual do funcionario?")
    var salario = readlnOrNull()?.toDoubleOrNull()?: run {
        println("valor invalido")
        return
    }

    println("Qual o percentual de ajuste do salario")
    var percentualReajuste = readlnOrNull()?.toDoubleOrNull()?: run {
        println("percentual invalido")
        return
    }

    val aumento = salario * (percentualReajuste / 100)

    val novoSalario = salario + aumento

    println("O salario atualizado do funcionario sera $novoSalario")

}