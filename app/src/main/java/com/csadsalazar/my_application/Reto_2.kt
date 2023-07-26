package com.csadsalazar.my_application

class Reto_2 {
}
fun main(){
    var con: String
    var tot: Float
    var pro: Float
    var cant: Float
    var res: Float=0F

    println("En Supermercados Noé estamos de aniversario y te obsequiamos un descuento en el valor de tu compra, si ésta es mayor a 50,000 y dependiendo de tu suerte:\n" +
            "\n" +
            "Si sacas la bolita roja obtienes 10% en el valor de tu compra\n" +
            "\n" +
            "Si sacas la bolita azul obtienes un 30% en el valor de tu compra\n" +
            "\n" +
            "Si sacas la bolita amarilla obtienes un 50% en el valor de tu compra Si sacas la bolita blanca te llevas tu compra gratis\n")
    do {
        println("Ingrese el valor del producto")
        pro= readLine()!!.toFloat()
        println("Cantidad del producto")
        cant= readLine()!!.toFloat()
        println("Desea digitar otro valor?")
        con = readLine()!!.toString()
        tot=pro*cant
        res= res+tot
    } while (con == "Si" || con == "SI" || con == "sI" || con == "si")

    var bola: Int= (1..4).random()
    if (res>50000 && bola==1) {
        println("Su valor a pagar es ${res} \nSacaste la bola roja obtienes 10% de descuento en el valor de tu compra \nTu valor a pagar es ${(res-(res*0.10))}")

    }else if(res>50000 && bola==2){
        println("Su valor a pagar es ${res} \nSacaste la bola azul obtienes 30% de descuento en el valor de tu compra \nTu valor a pagar es  ${(res-(res*0.30))}")
    }
    else if(res>50000 && bola==3){
        println("Su valor a pagar es ${res} \nSacaste la bola amarilla obtienes 50% de descuento en el valor de tu compra \nTu valor a pagar es  ${(res/2)}")
    }
    else if(res>50000 && bola==4){
        println("Su valor a pagar es ${res} \nSacaste la bola blanca \n¡FELICITACIONES, TE LLEVAS TU COMPRA TOTALMENTE GRATIS!!!")
    }else
        println("Tu compra no ha sido beneficiada \nSu valor a pagar es ${res}")
}