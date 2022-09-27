//	Realizar una funci�n que permita obtener el t�rmino n de la sucesi�n de Fibonacci. La
//	sucesi�n de Fibonacci es la sucesi�n de los siguientes n�meros:
//	1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//	Donde cada uno de los n�meros se calcula sumando los dos anteriores a �l. Por ejemplo:
//	La sucesi�n del n�mero 2 se calcula sumando (1+1)
//	An�logamente, la sucesi�n del n�mero 3 es (1+2),
//	Y la del 5 es (2+3),
//	Y as� sucesivamente...
//	La sucesi�n de Fibonacci se puede formalizar de acuerdo a la siguiente f�rmula:
//	Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
//		Fibonacci (n) = 1 para todo n <= 1
//			Por lo tanto, si queremos calcular el t�rmino "n" debemos escribir una funci�n que reciba
//				como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.

Algoritmo sin_titulo
	
	Definir num Como Entero
	Escribir "Ingrese un n�mero"
	Leer num
	
	Escribir "La secuencia Fibonacci del n�mero ", num, " es: ", fibonacci(num)
	
FinAlgoritmo

Funcion dolor <- fibonacci(num)
	
	Definir dolor, i, num1, num2, aux Como Entero
	num1 = 0
	num2 = 1
	
	Para i <- 1 Hasta num Hacer
		
		Si num == 1 o num == 2
			dolor = 1
		SiNo
			aux = num1 + num2
			num1 = num2
			dolor = num1
			num2 = aux
		FinSi
		
	FinPara
	
FinFuncion
