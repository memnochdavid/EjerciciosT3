package com.example.ejercicio01t3

fun main(){
    //ejercicio01
    var num=5
    esPar(num)
    if(esPar(num)) println("El numero $num es par") else println("El numero $num es impar")

    //ejercicio02
    var uno="Hola"
    var dos="caracola"
    println("Con operador '=='")
    if(compararTexto(uno,dos,1)) println("Son iguales") else println("No son iguales")
    println("Con la función equals()")
    if(compararTexto(uno,dos,2)) println("Son iguales") else println("No son iguales")

    //ejercicio03
    var n1=50
    var n2=4
    if(esMayorQue10YMenorQue20(n1,n2)) println("Los numeros $n1 y $n2 son mayores que 10 y menores que 20") else println("Los numeros $n1 y $n2 no son mayores que 10 y menores que 20")

    //ejercicio04
    var calificacion=60
    println("La calificacion $calificacion equivale a una ${evaluarCalificacion(calificacion)}")

}

//funciones
//Ej01
fun esPar(n:Int):Boolean{
    if(n%2==0) return true
    else return false
}
//Ej02
fun compararTexto(uno:String, dos:String, opc:Int):Boolean{
    when(opc){
        1->{//==
            return uno == dos
        }
        2->{//equals
            return (uno.equals(dos))
        }
        else->{
            return false
        }
    }
}

//Ej03
fun esMayorQue10YMenorQue20(num1:Int, num2:Int):Boolean{
    return (num1>10 && num1<20 && num2>10 && num2<20)
}

//Ej04
fun evaluarCalificacion(nota:Int):Char{
    when(nota){
        in 0..59->return 'F'
        in 60..69->return 'D'
        in 70..79->return 'C'
        in 80..89->return 'B'
        in 90..100->return 'A'
        else->return 'X'
    }
}