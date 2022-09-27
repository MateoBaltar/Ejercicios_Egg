//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
//con números aleatorios entre 1 y 100 y mostrar su traspuesta.

Algoritmo sin_titulo
	Definir matriz, n, m, traspuesta, i, j Como Entero
	Escribir "Ingrese el rango de su matriz"
	Leer n,m
	
	Dimension matriz(n,m), traspuesta(m,n)
	
	Para i = 0 Hasta n-1
		Para j = 0 Hasta m-1
			matriz(i,j) = Aleatorio(1,100)
		FinPara
	FinPara
	
	Para i = 0 Hasta m-1
		Para j = 0 Hasta n-1
			traspuesta(i,j) = matriz(j,i)
		FinPara
	FinPara
	Para i = 0 Hasta n-1
		Para j = 0 Hasta m-1
			Escribir Sin Saltar, matriz(i,j), " "
		FinPara
		Escribir " "
	FinPara
	Escribir "----------------------"
	Para i = 0 Hasta m-1
		Para j = 0 Hasta n-1
			Escribir Sin Saltar, traspuesta(i,j), " "
		FinPara
		Escribir " "
	FinPara
	
FinAlgoritmo
