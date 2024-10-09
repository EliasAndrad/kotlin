package Condicionais

//19) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

fun main(){
    valorMaior()
}

fun valorMaior(){
    println("digite o primeiro valor")
    var valor1 = readlnOrNull()?.toDoubleOrNull()?: run {
        println("valor invalido")
        return
    }

    println("digite o segundo valor")
    var valor2 = readlnOrNull()?.toDoubleOrNull()?: run{
        println("valor invalido")
        return
    }

    if (valor1 > valor2){
        println("valor 1 é maior: $valor1")
    }else{
        println("valor 2 é maior: $valor2")
    }
}