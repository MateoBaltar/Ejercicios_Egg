//Escribir una estructura PARA que le solicite al usuario varios n�meros y al finalizar muestre el
//	mayor n�mero ingresado.

Algoritmo sin_titulo
	Definir num, mayor, i Como Entero
	mayor = 0
	i = 1
	Para i <- 1 Hasta 5 Hacer
		Escribir "Ingrese un n�mero"
		leer num
		Si num > mayor
			mayor = num
		FinSi
	Fin Para
	
	Escribir "El numero mayor ingresado es: ", mayor
	
FinAlgoritmo
