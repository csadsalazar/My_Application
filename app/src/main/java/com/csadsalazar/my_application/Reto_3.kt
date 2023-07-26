package com.csadsalazar.my_application

class Reto_3 {
}
fun main(){
    println("Bienvenidos a automoviles Jeff")
    var i: String="si"
    val lista: MutableList<String> = mutableListOf()
    do {
        println("Que deseas hacer el dia de hoy?")
        println("\nIngrese el numero de la opcion que desea \n1.Ingresar nuevos autos \n2.Mostrar los autos de la lista \n3.Buscar un carro en particular \n4.Modificar un vehiculo existtente \n5.Eliminar un vehiculo existente")
        var opt: Int= readLine()!!.toInt()

        if (opt==1){
            println("Ingresa el nombre del auto que deseas agregar")
            var add: String= readLine()!!.toString()
            lista.add(add)

        }else if (opt==2){
            println("Esta es la lista actual de los autos:")
            for ((index, element) in lista.withIndex()){
                println("El carro No. $index es $element")
            }

        }else if (opt==3){
            println("Ingrese el nombre del carro que desea consultar")
            var buscar:String= readLine()!!.toString()
            val buscare = lista.any {e -> e.equals(buscar, ignoreCase = true)}
            if (buscare==true) {
                println("El carro que usted buscó fue: ${buscar} ")
                //println(lista.find { it == buscar })
            }else{
                println("El carro consultado no existe")
            }

        }else if (opt==4){
            println("Ingrese el carro que desea modificar: ")
            var carro:String= readLine()!!.toString()
            val buscare = lista.any {o -> o.equals(carro, ignoreCase = true)}
            if (buscare==true) {
                println("Ingrese el cambio que desea realizar: ")
                var modifi: String = readLine()!!.toString()
                var cambio = lista.indexOf(carro)
                lista[cambio] = modifi
                println("La lista modificada quedó asi:")
                for ((index, element) in lista.withIndex()){
                    println("El carro No. $index es $element")
                }
            }else{
                println("El carro que desea modificar no esta en la lista")
            }

        }else if (opt==5){
            println("Ingrese el nombre del carro que desea eliminar")
            var delete: String= readLine()!!.toString()
            val buscare = lista.any {u -> u.equals(delete, ignoreCase = true)}
            if (buscare==true) {
                lista.remove(delete)
                println("El carro que usted eliminó fue: ${delete} y la lista quedó asi:")
                for ((index, element) in lista.withIndex()){
                    println("El carro No. $index es $element")
                }
            }else{
                println("El carro que desea eliminar no se encuentra en la lista")
            }
        }else{
            println("Tu desición no está dentro de las posibilidades.")
        }

        println("Desea realizar otra operacion?")
        i= readLine()!!.toString()

    }while (i == "Si" || i == "SI" || i == "sI" || i == "si")
    println("Gracias.. Pico y Chao")
}
