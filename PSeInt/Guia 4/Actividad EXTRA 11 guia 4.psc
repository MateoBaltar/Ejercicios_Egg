//Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
//ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
//ceros.
//Por ejemplo, nuestro matriz final debería verse así:
//	111111111111111
//	100000000000001
//	100000000000001
//	100000000000001
//	111111111111111

Algoritmo sin_titulo
	Definir matriz, i, j, n, m Como Entero
	Escribir "Ingrese al dimension de la matriz"
	Leer n,m
	
	Dimension matriz(n,m)
	
	
	
	Para i = 0 Hasta n-1 Hacer
		Para j = 0 Hasta m-1 Hacer
			Si i = 0 O i = n-1 O j = m-1 O j = 0 Entonces
				matriz(i,j) = 1
				Escribir Sin Saltar matriz(i,j)
			SiNo
				matriz(i,j) = 0
				Escribir Sin Saltar matriz(i,j)
			FinSi
		FinPara
		Escribir ""
	FinPara
	
	
FinAlgoritmo
