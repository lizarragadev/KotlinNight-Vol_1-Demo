fun main() {
    /*val valor1 = 4
    val valor2 = 2
    var resultado = valor1.plus(valor2)
    println("La suma es: $resultado")
    resultado = valor1.minus(valor2)
    println("La resta es: $resultado")
    resultado = valor1.times(valor2)
    println("La mutiplicacion es: $resultado")
    val resu = valor1.div(valor2).toDouble()
    println("La division es: $resu")*/


    /*print("Ingrese numero 1: ")
    val v1 = readLine()!!.toInt()
    print("Ingrese numero 2: ")
    val v2 = readLine()!!.toInt()
    println("La suma es: ${v1.plus(v2)}")
    println("La resta es: ${v1.minus(v2)}")
    println("La multiplicacion es: ${v1.times(v2)}")
    println("La division es: ${v1.div(v2)}")*/



    /*val rangoCarac = 'a'..'z'
    val letraABuscar = 'B'

    if(letraABuscar in rangoCarac) {
        print("La letra $letraABuscar SI está en el rango de $rangoCarac")
    } else {
        print("La letra $letraABuscar NO está en el rango de $rangoCarac")
    }*/





    /*val rangoNumerico = 1..100

    for(i in rangoNumerico) {
        print("$i, ")
    }*/




    /*for(i in 100 downTo 2 step 2) {
        print("$i, ")
    }
    println()
    for((index, i) in ((2..100).reversed() step 2).withIndex()) {
        print("$index, ")
    }*/




    /*val rangoLetras = '@'..'z'
    for(i in rangoLetras) {
        print("$i, ")
    }*/




    /*print("Ingrese un día de la semana: ")
    val dato1 = readLine()!!.toInt()
    when(dato1) {
        1 -> print("Lunes")
        2 -> print("Martes")
        3 -> print("Miércoles")
        4 -> print("Jueves")
        5 -> print("Viernes")
        6 -> print("Sábado")
        7 -> print("Domingo")
        else -> print("No valido")
    }*/




    /*print("Ingrese el valor de un lado de un cuadrado: ")
    val lado = readLine()!!.toInt()
    val superficieFun = retornarSuperficie(lado)
    println("La superficie del cuadrado es: $superficieFun")*/



    /*print("Ingrese el valor de un lado del cuadrado: ")
    val lado2 = readLine()!!.toInt()
    mostrarPerimetro(lado2)*/



    /*print("Ingrese el valor de un lado de un cuadrado: ")
    val la = readLine()!!.toInt()
    val superficie = retSuperficie(la)
    println("La superficie del cuadrado es: $superficie")*/



    /*val piloto = Piloto()
    piloto.nombre = "Alberto"
    piloto.apellido = "Lopez"
    piloto.edad = 45
    piloto.codigo = "F77-22"
    piloto.empresa = "Amaszonas"

    println("${piloto.nombre} - ${piloto.apellido} - ${piloto.edad} - ${piloto.codigo} - ${piloto.empresa} - ")

    val avion = Avion("Boeing", "Avion", "KN-321")
    println("${avion.nombreMedioT} - ${avion.tipo} - ${avion.placa}")*/




    /*var nombre: String?
    nombre = null

    var x: Int? = null
    if(x != null) {
        val y = x.toDouble()
    } else {
        val y = 0.0
    }


    // Expresion de acceso seguro
    val y = x?.toDouble()

    // Operador ELVIS  ?:
    val y1 = x?.toDouble() ?: 0.0

    // !! (mala practica)
    val y2 = x!!.toDouble()*/


}

fun retornarSuperficie(l: Int) : Int {
    return l.times(l)
}

fun mostrarPerimetro(l: Int) {
    val perimetro = l.times(4)
    print("El perimetro es: $perimetro")
}

fun retSuperficie(l: Int) = l.times(l)