//Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree un
//cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:
//		* * * *
//		*     *
//		*     *
//		* * * *
Algoritmo sin_titulo
	Definir num, i, e Como Entero
	Escribir "Ingrese un número entero"
	leer num
	Para i <- 1 hasta num Hacer
		Para e <- 1 Hasta num Hacer
			Si i > 1 Y i < num Y e > 1 Y e < num
				Escribir Sin Saltar "  "
			SiNo
				Escribir Sin Saltar "* "
			FinSi
		FinPara
		Escribir ""
	FinPara
	
	
	
FinAlgoritmo
