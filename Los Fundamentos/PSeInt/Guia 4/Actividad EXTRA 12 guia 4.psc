//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//Inicialice las matrices para evitar el ingreso de datos por teclado.

Algoritmo sin_titulo
	Definir matriz, matriz2, i, j, multi Como Real
	Dimension matriz(3,3), matriz2(3,3)
	multi = 1
	para i = 0 Hasta 2
		para j = 0 Hasta 2
			matriz(i,j) = Aleatorio(1,9)
			matriz2(i,j) = Aleatorio(1,9)
		FinPara
	FinPara
	Para i = 0 Hasta 2
		Para j = 0 Hasta 2
			Escribir Sin Saltar, matriz(i,j), " "
		FinPara
		Escribir " "
	FinPara
	Escribir "----------------------------"
	Para i = 0 Hasta 2
		Para j = 0 Hasta 2
			Escribir Sin Saltar, matriz2(i,j), " "
		FinPara
		Escribir " "
	FinPara
	Escribir "---------------------------"
	para i = 0 Hasta 2
		para j = 0 Hasta 2
			multi = multi * (matriz(i,j) * matriz2(i,j))
		FinPara
	FinPara
	
	Escribir multi
	
FinAlgoritmo
