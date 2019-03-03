fun sum(a: Double, b: Double): Double {
    return a + b
}

fun rest(a: Double, b: Double): Double {
    return a - b
}

fun mult(a: Double, b: Double): Double {
    return a * b
}

fun div(a: Double, b: Double): Double {
    return a / b
}

fun main(){
    var a: Double
    var b: Double 
    var r: Int
    
    do{
       println("Ingrese dos numeros")
       a = readLine()?.toDouble() as Double
       b = readLine()?.toDouble() as Double

       println("La suma de $a y $b es")
       println(sum(a, b))

       println("La resta de $a y $b es")
       println(rest(a, b))

       println("La multiplicacion de $a y $b es")
       println(mult(a, b))

       if (b == 0.0){
          println("No es posible dividir sobre 0")
       }
       else{
          println("La divicion de $a y $b es")
          println(div(a, b))
       }
      println ("¿Desea realizar otra operacion? (1/0)")
      r = readLine()?.toInt() as Int
   } while (r == 1)
}