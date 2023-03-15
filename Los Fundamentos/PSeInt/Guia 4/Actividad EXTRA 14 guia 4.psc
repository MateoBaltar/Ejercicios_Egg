//Realizar un programa que permita visualizar el resultado del producto de una matriz de
//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
//inicializarse evitando así el ingreso de datos por teclado.

Algoritmo sin_titulo
	Definir matriz, vector, i , j Como Entero
	Dimension matriz(3,3), vector(3)
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz(i,j) = Aleatorio(1,10)
		FinPara
		vector(i) = Aleatorio(1,10)
	FinPara
	
	Escribir "Valores de los vectores:"
	Para i = 0 Hasta 2 Hacer
		Escribir Sin Saltar vector(i), " "
	FinPara
	
	Escribir " "
	
	Escribir "Matriz antes de multiplicar:"
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir Sin Saltar matriz(i,j), " "
		FinPara
		Escribir ""
	FinPara
	
	Escribir "----------------------------"
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz(i,j) = matriz(i,j) * vector(j)
		FinPara
	FinPara
	
	Escribir "Matriz despues de multiplicar:"
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir Sin Saltar matriz(i,j), " "
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
