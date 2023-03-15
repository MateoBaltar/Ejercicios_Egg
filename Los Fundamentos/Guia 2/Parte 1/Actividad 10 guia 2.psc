///Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
///En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni impar".
///Nota: investigar la función mod de PSeInt

Algoritmo sin_titulo
	Definir num1, numpar Como Entero
	Escribir "Ingresa un número entero:"
	leer num1
	
	numpar = num1 mod 2
	Si num1 == 0
		Escribir "El número no es par ni impar"
	SiNo
		si numpar == 0
			Escribir "El número es par"
		SiNo
			Escribir "El número es impar"
		FinSi
	FinSi
	
	
FinAlgoritmo
