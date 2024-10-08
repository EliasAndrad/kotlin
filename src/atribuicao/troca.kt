/*Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B. 
A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o 
valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados 
nas variáveis. */

fun main(){
    troca()
}

fun troca(){
    var a = 10
    var b = 20

    var temp = a
    a = b
    b = temp

    println("variavel A: " + a)
    println("variavel B: " + b)

}