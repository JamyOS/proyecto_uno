
class Calculadora{
	var x:Int
	var y:Int
	var c:Int?=null
	constructor( x:Int, y:Int){
		this.x=x
		this.y=y
	}
	fun Suma(){
		c=x+y
		println("El resultado de la suma es :$c")
	}
	fun Resta(){
		c=x-y
		println("El resultado de la resta es :$c")
	}
	fun Multiplicar(){
		c=x*y
		println("El resultado de la multiplicacion es :$c")
	}
	fun Divicion(){
		if (y < 0)
			println("Divicion entre cero no se puede realizar")
		else{
			c=x/y
			println("El resultado de la divicion es :$c ");	
		}		
	}
}
fun Menu():Int{
	var op:Int
	println()
	println("ingrese la opcion deseada")
	println("1.--Suma")
	println("2.--Resta")
	println("3.--Multiplicacion")
	println("4.--Divicion")
	println("0.--Salir")
	op=try{
		readLine()?.toInt() as Int

	}catch(_: NumberFormatException){
		8
	} 
	
	return op;

}
fun Ingresar():Calculadora{
	var numero:Int
	var numero2:Int
	println("Ingrese el primer numero")
	numero=readLine()?.toInt() as Int
	println("Ingrese el segundo numero")
	numero2=readLine()?.toInt() as Int
	var Cal=Calculadora(numero,numero2)
	return Cal
}
fun main(){
	do{
		var op=Menu();
		when(op){
			0->{println("Hasta luego !!..")}
			1->{var Cal=Ingresar()
				Cal.Suma()}  
			2->{var Cal=Ingresar()
				Cal.Resta()}
			3->{var Cal=Ingresar()
				Cal.Multiplicar()}
			4->{var Cal=Ingresar()
				Cal.Divicion()}
			else->{println("opcion no valida")}
		}
	}while(op!=0)

}
