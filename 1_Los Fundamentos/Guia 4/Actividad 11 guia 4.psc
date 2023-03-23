//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
//	subproceso para imprimir la matriz.
//

Algoritmo sin_titulo
	Definir matriz Como Entero
	Dimension matriz(5,5)
	
	rellenar(matriz)	
	
	impresora(matriz)
FinAlgoritmo


SubProceso rellenar(matriz Por Referencia)
	Definir i, j Como Entero
	para i = 0 Hasta 4
		para j = 0 Hasta 4
			Si i == j
				matriz(i,j) = 0
			SiNo
				matriz(i,j) = Aleatorio(0,9)
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso impresora(matriz por referencia)
	Definir i, j Como Entero
	para i = 0 Hasta 4
		para j = 0 Hasta 4
			Escribir Sin Saltar matriz(i,j) " "
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
	
	
	
