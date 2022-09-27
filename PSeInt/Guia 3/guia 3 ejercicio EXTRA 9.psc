//El número de combinaciones de m elementos tomados de n es:

//	Diseñar una función que permita calcular el número combinatorio de 

//Nota: n debe ser mayor a 0 y menor que m.

Algoritmo sin_titulo
	Definir n,m Como Entero
	
	Hacer
		Escribir "Escribir el valor de n"
		Leer n
	
		Escribir "Ingrese el valor de m"
		leer m
	Mientras Que n = 0 O n > m
	
	Escribir "El numero combinado es: ", combinar(n,m)
FinAlgoritmo

Funcion combinacion <- combinar(n,m)
	Definir combinacion Como real
	
	combinacion = m! / (m-n)!
	
FinFuncion
