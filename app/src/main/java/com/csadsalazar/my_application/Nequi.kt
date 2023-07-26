package com.csadsalazar.my_application

class Nequi {
}
fun main() {
    var intentos: Int = 0
    var i: String = "si"
    val numeros = mutableListOf<Long>(1234567891)
    val claves = mutableListOf<Long>(1234)
    var base: Double = 4500.0
    // Agregar algunos usuarios


    fun nequi() {
        println("BIENVENIDO A NEQUI COLOMBIA")
        println("Si ya tienes una cuenta digita 1")
        println("Si deseas crear una cuenta digita 2")
        var inicio: Int = readLine()!!.toInt()


        fun Intentos() {
            println("Por alcanzar el numero de intentos maximo, espere 1 minuto para poder entrar a la app")
        }

        if (inicio == 1) {
            fun Inicio() {
                println("BIENVENIDO A NEQUI COLOMBIA")
                println("LOGIN-INICIO DE SESION")
                println("Ingrese su número de celular:")
                val numeroIngresado: Long = readLine()!!.toLong()
                println("Ingrese su clave:")
                val claveIngresada: Long = readLine()!!.toLong()
                val indiceUsuario = numeros.indexOf(numeroIngresado)
                if (indiceUsuario != -1 && claves[indiceUsuario] == claveIngresada) {

                    println("////////////////////////////////////////////")
                    println("Inicio de sesión exitoso. Bienvenido!")

                    fun Opciones() {
                        println("////////////////////////////////////////////")
                        println("Tu saldo actual es de ${base}COP")
                        println("¿Que desea hacer hoy? \n1.Consultar Saldo \n2.Retirar \n3.Recargar \n4.Enviar \n5.Cerrar Sesion")
                        val des: Int = readLine()!!.toInt()

                        if (des == 1) {
                            fun Consultar() {
                                println("////////////////////////////////////////////")
                                println("Tu saldo actual es de ${base}COP")
                            }
                            Consultar()
                        } else if (des == 2) {


                            fun Retirar() {
                                println("¿Desde donde desea retirar? \n1.Cajero \n2.Punto Fisico")
                                var des: Int = readLine()!!.toInt()
                                if (des == 1) {
                                    println("Cuanto dinero desea retirar")
                                    var sacar: Double = readLine()!!.toDouble()
                                    if (sacar < 2000) {
                                        println("////////////////////////////////////////////")
                                        println("No se puede retirar menos de 2000.0 COP")
                                        Opciones()
                                    } else if (sacar > base) {
                                        println("////////////////////////////////////////////")
                                        println("Su valor a retirar no concuerda con su tarifa actual")
                                        Opciones()
                                    } else {
                                        base = (base - sacar)
                                        println("////////////////////////////////////////////")
                                        var results: Int = (100000..999999).random()
                                        println("Retiro Exitoso \nCodigo generado: ${results}")
                                        Opciones()
                                    }
                                } else if (des == 2) {
                                    println("////////////////////////////////////////////")
                                    var results: Int = (100000..999999).random()
                                    println("DIRIGITE A TU PUNTO FISICO MAS CERCANO \nCodigo generado: ${results}")
                                    Opciones()
                                } else {
                                    println("////////////////////////////////////////////")
                                    println("Error en tu desicion, intentalo de nuevo")
                                    Retirar()
                                }
                            }
                            Retirar()


                        } else if (des == 3) {


                            fun Recargar() {
                                println("¿Cuanto dinero desea depositar?")
                                var depositar: Double = readLine()!!.toDouble()
                                println("¿Quieres seguir con el proceso?")
                                var des: String = readLine()!!.toString()
                                if (des == "Si" || des == "si" || des == "sI" || des == "SI") {
                                    base = base + depositar
                                    println("////////////////////////////////////////////")
                                    println("Se ha depositado correctamente")
                                    Opciones()
                                } else {
                                    println("Proceso cancelado")
                                    Opciones()
                                }

                            }
                            Recargar()


                        } else if (des == 4) {


                            fun Enviar() {
                                println("Digite el numero al que desea enviar")
                                var num: Long = readLine()!!.toLong()
                                println("Digite el valor a enviar")
                                var env: Double = readLine()!!.toDouble()
                                if (num > 9999999999) {
                                    println("////////////////////////////////////////////")
                                    println("El numero celular no es valido")
                                    Opciones()
                                } else {
                                    if (env > base) {
                                        println("////////////////////////////////////////////")
                                        println("El valor a enviar es superior a tu saldo")
                                        Opciones()
                                    } else {
                                        println("////////////////////////////////////////////")
                                        base = base - env
                                        println("Envio exitoso")
                                        Opciones()
                                    }
                                }
                            }
                            Enviar()


                        } else if (des == 5) {


                            fun Sesion() {
                                println("////////////////////////////////////////////")
                                println("Gracias por utilizar nuestro servicio.")
                                Inicio()
                            }
                            Sesion()


                        } else {
                            println("////////////////////////////////////////////")
                            println("No escogiste una opcion valida, intentalo de nuevo")
                            Opciones()
                        }
                    }
                    Opciones()
                } else {
                    intentos++
                    if (intentos == 3) {
                        Intentos()
                    } else {
                        println("////////////////////////////////////////////")
                        println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes tres intentos antes de bloquear tu cuenta")
                        println("////////////////////////////////////////////")
                        Inicio()
                    }
                }
            }
            Inicio()
        } else if (inicio == 2) {


            fun Registro() {
                println("Ingrese un numero celular")
                var numero: Long = readLine()!!.toLong()
                println("Ingrese su clave:")
                var clave: Long = readLine()!!.toLong()
                if (numero > 9999999999 || clave > 9999) {
                    println("El numero de celular o clave es invalid@")
                    Registro()
                } else {
                    numeros.add(numero)
                    claves.add(clave)
                    println("////////////////////////////////////////////")
                    println("Se ha registrado con exito, Listo para utilizar nuestros servicios")
                    println("////////////////////////////////////////////")
                    nequi()

                }
            }
            Registro()
        } else {
            println("OPCION NO VALIDA")
            nequi()
        }
    }
    nequi()
}

