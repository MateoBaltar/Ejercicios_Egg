///Realizar un programa que, dado un n�mero entero, visualice en pantalla si es par o impar.
///En caso de que el valor ingresado sea 0, se debe mostrar "el n�mero no es par ni impar".
///Nota: investigar la funci�n mod de PSeInt

Algoritmo sin_titulo
	Definir num1, numpar Como Entero
	Escribir "Ingresa un n�mero entero:"
	leer num1
	
	numpar = num1 mod 2
	Si num1 == 0
		Escribir "El n�mero no es par ni impar"
	SiNo
		si numpar == 0
			Escribir "El n�mero es par"
		SiNo
			Escribir "El n�mero es impar"
		FinSi
	FinSi
	
	
FinAlgoritmo
