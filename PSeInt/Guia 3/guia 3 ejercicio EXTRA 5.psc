//	Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
//	Ejemplo: 25 = 2 + 5 = 7
//	Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
//	resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.

Algoritmo sin_titulo
	Definir num Como Entero
	
	Hacer
		Escribir "Ingrese un n�mero de dos d�gitos"
		Leer num
	Mientras Que num >= 100
	
	Escribir "La suma de los d�gitos del n�mero es: ", sumar(num)
	
FinAlgoritmo

Funcion sumas <- sumar(num)
	Definir sumas Como Entero
	
	sumas = trunc(num / 10) + (num MOD 10)
	
FinFuncion

