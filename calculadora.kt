	fun ingresa(): Int{

	println("Ingrese valor")
	var l: Int = readLine()?.toInt() as Int

	return l

	}
	
	fun suma(a: Int, b: Int) = a+b
	fun resta(a: Int, b: Int) = a-b
	fun mult(a: Int, b: Int) = a*b
	fun div(a: Double, b: Double) = a/b;

	fun main(){

	var op: Int
	var a: Int
	var b: Int

	do{

		println("1.- Suma")
		println("2.- Resta")
		println("3.- Multiplicacion")
		println("4.- Division")
		println("0.- Salir")
		println("Ingrese la opcion que desea")
		try{
			op = readLine()?.toInt() as Int
		}catch(e: NumberFormatException){
			println("Ingrese numeros del '0 al 4'")
			op = 5
		 }

		when(op) {

		0 -> {println ("::..Saliendo del programa..::")}
		1 -> {a = ingresa()
					b = ingresa()
					println("La suma es ${suma(a,b)}")}
		2 -> {a = ingresa()
					b = ingresa()
					println("La resta es ${resta(a,b)}")}
		3 -> {a = ingresa()
					b = ingresa()
					println("La multiplicacion es ${mult(a,b)}")}
		4 -> {a = ingresa()
					b = ingresa()
					if(b == 0){
						println("Division entre '0' no existe")
					}else{
						println("La division es ${div(a.toDouble(),b.toDouble())}")
					 }
							 }
		else -> {println("Opcion no valida")}

		}

	}while(op != 0)

	}
