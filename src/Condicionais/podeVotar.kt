package Condicionais

// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
//poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
// considerando que pode votar acima dos 18 anos

fun main(){
    votacao()
}

fun votacao(){
    println("digite o ano atual")
    val anoAtual = readlnOrNull()?.toIntOrNull() ?: run {
        println("Data invalida")
        return
    }

    println("Qual seu ano de nascimento")
    val anoNascimento = readlnOrNull()?.toIntOrNull() ?: run {
        println("Data invalida")
        return
    }

    val idade = anoAtual - anoNascimento

    if (idade >= 18 ){
        println("você tem permissão para votar")
    }else{
        println("você ainda não pode votar, pois tem apenas $idade anos de idade")
    }
}