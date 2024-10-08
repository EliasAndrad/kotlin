package SelecaoOperdadoresRelacionais

//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)
fun main(){
    positivoNegativo()
}

fun positivoNegativo(){
    println("digite um valor")
    var entrada = readlnOrNull()?.toDoubleOrNull()?: run {
        println("valor invalido")
        return
    }

    if (entrada >= 0){
        println("Valor positivo")
    }else {
        println("Valor Negativo")
    }
}