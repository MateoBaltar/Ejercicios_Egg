//	Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//	tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//	numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//	Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
//	realizar el ejercicio.

Algoritmo sin_titulo
	Definir num Como Entero
	
	Hacer
		Escribir "Ingrese un número de hasta 3 digitos"
		Leer num
		
	Mientras Que num >= 1000
	
	Escribir "Todos los dígitos del número ingresado son impares = ", par(num)
FinAlgoritmo


Funcion VoF <- par(num)
	Definir VoF Como Logico
	
	Si num >= 100
		Si trunc(num / 100) MOD 2 <> 0
			Si trunc(num / 10) MOD 2 <> 0
				Si num mod 2 <> 0
					VoF = Verdadero
				FinSi
			FinSi
		FinSi
	FinSi
	
	Si num <= 99
		Si trunc(num / 10) MOD 2 <> 0
			Si num mod 2 <> 0
				VoF = Verdadero
			FinSi
		FinSi
	FinSi
	
	Si num <= 9
		Si num mod 2 <> 0
			VoF = Verdadero
		FinSi
	FinSi
FinFuncion
