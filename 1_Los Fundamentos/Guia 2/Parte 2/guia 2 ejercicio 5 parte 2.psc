//Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
//todos ellos.

Algoritmo sin_titulo
	Definir num, promedio, max, base, div, min, suma Como Real
	num = 0
	suma = 0
	div = 0
	max = 0
	min = 999999999999999999999999999999999999999999999999999999999999
	Hacer
		Escribir "Ingrese n�meros y para finalizar use 0"
		leer num
		suma = suma + num
		div = div + 1
		Si num > max
			max = num
		FinSi
		Si (num < min) Y (num > 0)
			min = num
		FinSi
	Mientras que num <> 0
	
	promedio = suma / div
	
	Escribir "El promedio de los numeros ingresados es: ", promedio	
	Escribir "El numero maximo es ", max
	Escribir "El numero minimo es ", min
	
FinAlgoritmo
