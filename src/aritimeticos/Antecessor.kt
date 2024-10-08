/*Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor. */

fun main (){
    antecessor()
}


fun antecessor(){

    println("digite um valor")
    
    //o operador ?. verifica se o valor lido por readline é nulo, se for nullo ele evita possivel erro e apenas retorna nulo.
    //se nao for nulo. "IntOrNull()" ele converte para int e caso de algum erro retorna nullo
    var entrada = readLine()?.toIntOrNull()


    //o operador elvis ?: é ultilizado para definir um valor padrão a uma expressão, nesse caso retornando a mensagem "Entrada invalida"
    val resultado = (entrada ?: return println("Entrada inválida."))
    
    println("O valor antecessor é: " + (entrada - 1))
    
}