package aritimeticos

// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
//mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
//efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
//vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
//vendedor.

fun main(){
 carrosVendidos()
}

fun carrosVendidos() {
    println("Qual a quantidade de carros vendido ? ")
    var vendas = readlnOrNull()?.toIntOrNull() ?: run {
        println("quantidade invalida")
        return
    }

    println("Qual o valor total das vendas ?")
    var valorTotalVenda = readlnOrNull()?.toDoubleOrNull() ?: run {
        println("valor invalido")
        return
    }

    println("Qual o salario do vendedor ?")
    var salarioVendedor = readlnOrNull()?.toDoubleOrNull() ?: run {
        println("valor invalido")
        return
    }

    println("Qual valor de comissão por carro vendido ?")
    var comissao = readlnOrNull()?.toDoubleOrNull() ?: run {
        println("print valor invalido")
        return

    }

    val comissaoTotal = vendas * comissao

    val comissaoPercentual = valorTotalVenda * 0.5

    val salarioFinal = comissaoTotal + comissaoPercentual + salarioVendedor

    println("O salario final do vendedor será: R$ ${"%.3f".format(salarioFinal)}")
}