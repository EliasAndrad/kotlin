package SelecaoOperdadoresRelacionais

//Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
//contrário escrever NÃO É MAIOR QUE 10!
fun main(){
    maior()
}

fun maior() {
    println("digite um valor")
    var entrada = readlnOrNull()?.toIntOrNull()?: run {
        println("valor invalido")
        return
    }

    if (entrada >= 10){
        println("É MAIOR QUE 10!")
    }else{
        println("NÃO É MAIOR QUE 10!")
    }
}