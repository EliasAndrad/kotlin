package Condicionais

//Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

fun main(){
    crescente()
}

fun crescente(){
    println("digite o primeiro valor")
    var valor1 = readlnOrNull()?.toDoubleOrNull()?: run {
        println("valor invalido")
        return
    }

    println("digite o segundo valor")
    var valor2 = readlnOrNull()?.toDoubleOrNull()?: run {
        println("valor invalido")
        return
    }

    if (valor1 < valor2){
        println("Ordem crescente: $valor1, $valor2")
    }else{
        println("Ordem crescente: $valor2, $valor1")



    }
}
