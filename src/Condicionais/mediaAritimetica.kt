package Condicionais

//Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
//uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
//aluno é aprovado). Escrever também a média calculada.

fun main (){
    media()
}

fun media(){
    println("Digite a nota da A1")
    var avaliacaoA1 = readlnOrNull()?.toDoubleOrNull()?: run{
        println("valor invalido")
        return
    }

    println("digite a nota da A2")
    var avaliacaoA2 = readlnOrNull()?.toDoubleOrNull()?: run{
        println("valor invalido")
        return
    }

    var media = (avaliacaoA2 + avaliacaoA1) / 2

    if (media >= 6)
        println("aluno aprovado, sua média é: $media")
    else{
        println("aluno reprovado, sua media é: $media")
    }
}