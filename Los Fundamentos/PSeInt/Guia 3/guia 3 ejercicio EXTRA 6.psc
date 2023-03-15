//	Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
//	tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//	numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.
//	Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para
//	realizar el ejercicio.

Algoritmo sin_titulo
	Definir num Como Entero
	
	Hacer
		Escribir "Ingrese un n�mero de hasta 3 digitos"
		Leer num
		
	Mientras Que num >= 1000
	
	Escribir "Todos los d�gitos del n�mero ingresado son impares = ", par(num)
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
