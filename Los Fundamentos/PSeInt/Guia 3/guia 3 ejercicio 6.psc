//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.

Algoritmo sin_titulo
	Definir num1,num2 Como entero
	Escribir "Ingrese dos numeros"
	Leer num1, num2
	intercambia(num1,num2)
	Escribir "Los numeros cambiados en orden son -> " num1, " y ", num2

FinAlgoritmo

SubProceso intercambia(num1 por referencia, num2 por referencia)
	Definir reten Como Entero
	reten = num1
	num1 = num2
	num2 = reten
	FinSubProceso
	