//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//Por ejemplo:
//	2 7 6
//	9 5 1
//	4 3 8
//	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un
//	algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que
//			sea mágica escribir la suma. Además, el programa deberá comprobar que los números
//			introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la
//			matriz que no debe superar orden igual a 10.

Algoritmo sin_titulo
	Definir matriz, filas,columnas, diagonal, m, n, i, j, contador, aux Como Entero
	Definir VoF, VoF1, VoF2 Como Logico
	contador= 0
	Hacer
		Escribir "Ingrese las dimensiones que desea en la matriz hasta 10 (debe ser cuadrada)"
		Leer m,n
	Mientras Que m <> n
	
	Dimension matriz(m,n), filas(m), columnas(m), diagonal(m)
	aux = n
	Para i = 0 Hasta m-1 Hacer
		filas(i) = 0
		columnas(i) = 0
		diagonal(i) = 0
	FinPara
	
	Para i = 0 Hasta m-1 Hacer
		para j = 0 Hasta n-1 Hacer
			Hacer
				Escribir "Ingrese el valor para la posicion en la matriz:" i, ",", j, " (Entre 1 y 9)"
				Leer matriz(i,j)
				Si matriz(i,j) > 9
					Escribir "El valor ingresado es superior a 9"
				FinSi
			Mientras Que matriz(i,j) > 9 
		FinPara
	FinPara
	
	Para i = 0 Hasta m-1 Hacer
		para j = 0 Hasta n-1 Hacer
			filas(i) = filas(i) + matriz(i,j)
		FinPara
	FinPara
	
	Para i = 0 Hasta m-1 Hacer
		para j = 0 Hasta n-1 Hacer
			Si i == j Entonces
				diagonal(0) = diagonal(0) + matriz(i,j)
			FinSi
		FinPara
	FinPara
	Para i = 0 Hasta m-1 Hacer
		para j = 0 Hasta n-1 Hacer
			Si j == aux-1
				diagonal(1) = diagonal(1) + matriz(i,j)
				aux = aux-1
			FinSi
		FinPara
	FinPara
	
	
	Para j = 0 Hasta m-1 Hacer
		Para i = 0 Hasta m-1 Hacer
			columnas(i) = columnas(i) + matriz(i,j)
		FinPara
	FinPara
	
	Limpiar Pantalla
	
	para i = 0 Hasta m-1
		para j = 0 Hasta n-1
			Escribir Sin Saltar matriz(i,j) " "
		FinPara
		Escribir ""
	FinPara
	
	Para i = 0 Hasta m-1 Hacer
		Si filas(0) == filas(i)
			contador = contador + 1
			Si contador = m Entonces
				VoF = Verdadero
				contador = 0
			SiNo
				VoF = Falso
			FinSi
		FinSi
	FinPara
	Para i = 0 Hasta m-1 Hacer
		Si columnas(0) == columnas(i)
			contador = contador + 1
			Si contador = m Entonces
				VoF1 = Verdadero
				contador = 0
			SiNo
				VoF1 = Falso
			FinSi
		FinSi
	FinPara
	Para i = 0 Hasta m-1 
		Si diagonal(0) == diagonal(1)
			contador = contador + 1
			Si contador = m Entonces
				VoF2 = Verdadero
				contador = 0
			SiNo
				VoF2 = Falso
			FinSi
		FinSi
	FinPara
	
	Si VoF = Verdadero Y VoF1 = Verdadero Y VoF2 = Verdadero
		Escribir "El cuadrado es magico"
	SiNo
		Escribir "El cuadrado no es magico"
	FinSi
	
FinAlgoritmo
