//Se debe crear una matriz con las siguientes palabras como se muestra a
//continuación. Luego de eso debemos acomodar las palabras para que la primera
//	letra ?R? de cada una quede en la posición 5, alineándose.
	
Algoritmo sin_titulo
	Definir matriz, frase  Como caracter
	Definir posicion,contador Como Entero
	Dimension matriz(9,12), posicion(9), contador(9)
	
inicializarMatriz(matriz)
imprimirMatriz(matriz)
agregarPalabra(matriz,frase)
buscarR(matriz, posicion)
acomodarPalabra(matriz, posicion,contador)
imprimirMatriz(matriz)
FinAlgoritmo

SubProceso inicializarMatriz(matriz Por Referencia)
	Definir i, j Como Entero
	Para i = 0 Hasta 8 Hacer
		Para j = 0 Hasta 11 Hacer
			matriz(i,j) = "*"
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(matriz Por Referencia)
	Definir i, j Como Entero
	Para i = 0 Hasta 8 Hacer
		Para j = 0 Hasta 11 Hacer
			Escribir Sin Saltar matriz(i,j), " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso agregarPalabra(matriz Por Referencia, frase Por Referencia)
	Definir i, j Como Entero
	Para i = 0 Hasta 8 Hacer
		Escribir "Por favor ingrese una palabra para introducir a la matriz (",i,")"
		Leer frase
		Para j = 0 Hasta Longitud(frase)-1 Hacer
			matriz(i,j) = Subcadena(frase,j,j)
		FinPara
	FinPara
FinSubProceso

SubProceso buscarR(matriz Por Referencia, posicion Por Referencia)
	Definir i, j, conta Como Entero
	conta = 0
	Para i = 0 Hasta 8 Hacer
		conta = 0
		Para j = 0 Hasta 11 Hacer
			Si matriz(i,j) = "r" o matriz(i,j) = "R"
				Si conta = 0 Entonces
					posicion(i) = j
					conta = conta + 1
				FinSi
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso acomodarPalabra(matriz Por Referencia, posicion Por Referencia, contador Por Referencia)
	Definir i, j, n, x, conta Como Entero
	conta = 0
	Para i = 0 Hasta 8 Hacer
		contador(i) = 0
		Si posicion(i) < 5 Entonces
			para j = posicion(i) Hasta 5 Hacer
				contador(i) = contador(i) + 1
			FinPara
		SiNo
			Si posicion(i) > 5 Entonces
				para j = posicion(i) Hasta 5 Con Paso -1 Hacer
					contador(i) = contador(i) + 1
				FinPara
			SiNo
				Si posicion(i) = 5 Entonces
					
				FinSi
			FinSi
			
		FinSi
	FinPara
	
	Para i = 0 Hasta 8 Hacer
		Si posicion(i) < 5
			Para n = 2 Hasta contador(i) Hacer
				Para j = 11 Hasta 1 Con Paso -1 Hacer
					matriz(i,j) = matriz(i,j-1)
				FinPara
				matriz(i,0) = "*"
			FinPara
		SiNo
			Si posicion(i) > 5 Entonces
				Para j = 11 Hasta contador(i) Hacer
					matriz(i,j) = matriz(i,j-1)
				FinPara
			SiNo
				Si posicion(i) = 5 Entonces
					
				FinSi
			FinSi
		FinSi
	FinPara
FinSubProceso
	