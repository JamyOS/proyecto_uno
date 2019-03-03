fun sum(a: Int, b: Int): Int {
    return a + b
}

fun rest(a: Int, b: Int): Int {
    return a - b
}

fun mult(a: Int, b: Int): Int {
    return a * b
}

fun div(a: Int, b: Int): Int {
    return a / b
}

fun main(){
    var a: Int 
    var b: Int 

    println("Ingrese dos numeros")
    a = readLine()?.toInt() as Int
    b = readLine()?.toInt() as Int

    println("La suma de $a y $b es")
    println(sum(a, b))

    println("La resta de $a y $b es")
    println(rest(a, b))

    println("La multiplicacion de $a y $b es")
    println(mult(a, b))

    println("La divicion de $a y $b es")
    println(div(a, b))
}