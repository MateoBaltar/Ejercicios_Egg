//Realizar un programa que rellene de números aleatorios una matriz a través de un
//subprograma y generar otro subprograma que muestre por pantalla la matriz final.

Algoritmo sin_titulo
	Definir num Como Entero
	Dimension num(10,10)
	
	rellenar(num)
	
	dibujar(num)
	
	
FinAlgoritmo

SubProceso rellenar(num Por Referencia)
	Definir i, j Como Entero
	Para i = 0 Hasta 9
		Para j = 0 Hasta 9
			num(i,j) = Aleatorio(0,9)
		FinPara
	FinPara
	
FinSubProceso

SubProceso dibujar(num Por Referencia)
	Definir i, j Como Entero
	Para i = 0 Hasta 9
		Para j = 0 Hasta 9
			Escribir Sin Saltar, num(i,j), " "
		FinPara
		Escribir " "
	FinPara
FinSubProceso
