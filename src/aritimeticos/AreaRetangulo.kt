// Escreva um algoritmo para ler as dimensões de um retângulo
// (base e altura), calcular e escrever a área do retângulo.

fun main(){
    areaRetangulo()
}

fun areaRetangulo(){
    println("Por favor insira o valor da altura do retangulo: ")
    var altura = readLine()?.toDoubleOrNull()

    println("Por favor insira o valor da base do retangulo: ")
    var base = readLine()?.toDoubleOrNull()

    var area = (altura ?: return println("valor invalido")) * (base ?: return println("valor invalido"))


    println("A area do seu retangulo é: " + area)
}