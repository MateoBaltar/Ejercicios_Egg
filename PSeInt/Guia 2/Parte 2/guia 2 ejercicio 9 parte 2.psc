//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree un
//cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
//		* * * *
//		*     *
//		*     *
//		* * * *
Algoritmo sin_titulo
	Definir num, i, e Como Entero
	Escribir "Ingrese un n�mero entero"
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
