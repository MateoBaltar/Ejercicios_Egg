//	Realizar una función que calcule la suma de los dígitos de un número.
//	Ejemplo: 25 = 2 + 5 = 7
//	Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el
//	resto de una división entre 10. Recordar el uso de la función Mod y Trunc.

Algoritmo sin_titulo
	Definir num Como Entero
	
	Hacer
		Escribir "Ingrese un número de dos dígitos"
		Leer num
	Mientras Que num >= 100
	
	Escribir "La suma de los dígitos del número es: ", sumar(num)
	
FinAlgoritmo

Funcion sumas <- sumar(num)
	Definir sumas Como Entero
	
	sumas = trunc(num / 10) + (num MOD 10)
	
FinFuncion

