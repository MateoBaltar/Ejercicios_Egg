//Escribir un programa que realice la b�squeda lineal de un n�mero entero ingresado por el
//usuario en una matriz de 5x5, llena de n�meros aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
//caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.


Algoritmo sin_titulo
	Definir num, i, j, busca, contador Como Entero
	Dimension num(5,5)
	contador = 0
	para i = 0 Hasta 4
		para j = 0 Hasta 4
			num(i,j) = Aleatorio(0,20)
		FinPara
	FinPara
	
	Escribir "ingrese el n�mero que desea encontrar"
	Leer busca
	
	Escribir "El n�mero que busca se encuentra en la matriz:"
	
	para i = 0 Hasta 4
		para j = 0 Hasta 4
			Si num(i,j) == busca
				Escribir "[" i, ",", j, "]"
				contador = contador + 1
			FinSi
		FinPara
	FinPara
	Si contador = 0
		Limpiar Pantalla
		Escribir "El numero buscado no se encuentra en la matriz"
	FinSi
	
FinAlgoritmo
