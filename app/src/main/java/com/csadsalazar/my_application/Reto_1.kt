package com.csadsalazar.my_application

class Reto_1 {
}
fun main (){
    println("Craps apuesta a un solo tiro, en este juego se lanzan los dos dados, se gana si se obtiene un lanzamiento con:")
    println("Un par de unos en los dados. \nUn total de tres en los dados. \nUn total de once en los dados. \nSi se obtiene dos o doce en los dados. \nUn total de siete en los dados. \nEn el resto de situaciones se pierde. \nBUENA SUERTE!!!")
    println()

    var dado1: Int= (1..6).random()
    var dado2: Int= (1..6).random()
    if (dado1 == 1 && dado2 == 2){
        println("Has ganado, el valor de los dados es $dado1 y $dado2")
    }else if (dado1==1 && dado2==2 || dado1==2 && dado2==1){
        println("Has ganado, el valor de los dados es $dado1 y $dado2")
    }else if (dado1==6 && dado2==5 || dado1==5 && dado2==6){
        println("Has ganado, el valor de los dados es $dado1 y $dado2")
    }else if (dado1==1 && dado2==1 || dado1==6 && dado2==6){
        println("Has ganado, el valor de los dados es $dado1 y $dado2")
    }else if (dado1==5 && dado2==2 || dado1==6 && dado2==1 || dado1==4 && dado2==3 || dado1==2 && dado2==5 || dado1==1 && dado2==6 || dado1==3 && dado2==4){
        println("Has ganado, el valor de los dados es $dado1 y $dado2")
    }else{
        println("Ouuuuuuuuu!!! \nQue mala suerte, Has perdido con un valor de los dados de $dado1 y $dado2")
    }
}