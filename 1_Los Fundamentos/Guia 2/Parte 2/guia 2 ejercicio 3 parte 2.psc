//Dada una secuencia de n�meros ingresados por teclado que finaliza con un -1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de los
//	n�meros ingresados. Suponemos que el usuario no insertar� n�mero negativos.

Algoritmo sin_titulo
	Definir num, promedio, suma, div Como Real
	num = 0
	suma = 0
	div = 0
	Mientras num <> -1
		Escribir "Ingrese n�meros y para finalizar use -1"
		leer num
		suma = suma + num
		div = div + 1
	FinMientras
	
	promedio = suma / div
	
	Escribir "El promedio de los numeros ingresados es: ", promedio	
	
	
FinAlgoritmo
