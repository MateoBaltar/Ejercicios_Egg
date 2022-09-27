//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
//subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
//los resultados por pantalla.

Algoritmo sin_titulo
	Definir mat1, suma, n, m Como entero
	suma = 0
	Escribir "Ingrese el valor de n"
	Leer n
	Escribir "Ingrese el valor de m"
	Leer m
	Dimension mat1(n,m)
	rellenar(mat1,n,m)	
	sumar(mat1,n,m,suma)
	
	
FinAlgoritmo


SubProceso rellenar(mat1 Por Referencia, n Por Valor,m Por Valor)
	Definir i,j Como Entero
	
	para i = 0 Hasta n-1
		para j = 0 Hasta m-1
			mat1(i,j) = Aleatorio(-100,100)
		FinPara
	FinPara
	
FinSubProceso

SubProceso sumar(mat1 por referencia,n por valor,m Por Valor,suma Por Referencia)
	Definir i, j Como Entero
	
	para i = 0 Hasta n-1
		para j = 0 Hasta m-1
			suma = suma + mat1(i,j)
		FinPara
	FinPara
	
	para i = 0 Hasta n-1
		para j = 0 Hasta m-1
			Escribir Sin Saltar mat1(i,j) " "
		FinPara
		Escribir ""
	FinPara
	Escribir "La suma de todos los valores de la matriz es :", suma
	
FinSubProceso
	