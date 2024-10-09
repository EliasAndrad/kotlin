// Escreva um algoritmo para ler o número total de eleitores de um município,
// o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação
// ao total
//de eleitores.

package Aritimeticos

fun main(){
    votos()
}

fun votos(){
    println("Qual total de eleitores do municipios?") //operador elvis ?: verifica se a expressão a esquerda é nula.
    // caso seja execulta uma expressão alternativa
    var totalEleitores = readlnOrNull()?.toDoubleOrNull() ?: run {
        println("valor invalido")
        return
    }

    println("Qual a quantidade de votos brancos?")
    var votosBrancos = readlnOrNull()?.toDoubleOrNull()?: run {
        println("valor invalido")
        return
    }


    println("Qual a quantidade de votos nulos?")
    var votosNulos = readlnOrNull()?.toDoubleOrNull()?: run {
        println("valor invalido")
        return
    }

    println("Qual a quantidade de votos validos?")
    var votosValidos = readlnOrNull()?.toDoubleOrNull()?: run {
        println("valor invalido")
        return
    }

    val percentualVotosBrancos = (votosBrancos / totalEleitores) * 100

    val percentualVotosNulos =(votosNulos / totalEleitores) * 100

    val percentualVotosValidos = (votosValidos / totalEleitores) * 100


    println("O percentual de votos brancos é: $percentualVotosBrancos")
    println("O percentual de votos nulos é: $percentualVotosNulos")
    println("O percentual de votos validos é: $percentualVotosValidos")

}


