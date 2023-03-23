//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//deberá almacenar el resultado de sumar el número de la primera y segunda columna.


Algoritmo sin_titulo
	Definir matriz, i, j, n Como Entero
	Escribir "Ingrese la cantidad de filas que desea:"
	Leer n
	Dimension matriz(n,3)
	
	Para i = 0 Hasta n-1 Hacer
		Para j = 0 Hasta 1 Hacer
			Escribir "Ingrese valores para (", i, ",", j, ")"
			Leer matriz(i,j)
		FinPara
	FinPara
	
	Para i = 0 Hasta n-1 Hacer
		matriz(i,2) = matriz(i,0) + matriz(i,1)
	FinPara
	
	Para i = 0 Hasta n-1 Hacer
		Escribir matriz(i,0), " + ", matriz(i,1), " = " matriz(i,2)
	FinPara
	
FinAlgoritmo
