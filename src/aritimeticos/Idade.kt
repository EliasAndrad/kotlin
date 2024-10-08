/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade 
dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.*/

fun main(){
    idade()
}

fun idade(){
    println("quantos anos voce tem?")
    var anos = readLine()?.toIntOrNull() ?: run {
        println("Valor inválido para meses")
        return
    }
    println("quantos meses voce tem ?")
    var meses = readLine()?.toIntOrNull() ?: run {
        println("Valor inválido para meses")
        return
    }

    println("quantos dias voce tem ?")
    var dias = readLine()?.toIntOrNull() ?: run {
        println("Valor inválido para meses")
        return
    }

    var idadeEmDias = ((anos * 365) + (meses * 30) + dias)

    println("sua idade em dias é: " + idadeEmDias + " dias")

}