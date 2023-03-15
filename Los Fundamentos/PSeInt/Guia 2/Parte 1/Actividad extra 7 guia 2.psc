//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.

Algoritmo sin_titulo
	Definir num, digitos Como Entero
	Escribir "Ingrese un número entero"
	Leer num
	
	Si num < 0
		num = abs(num)
	FinSi
	
	Si (num >= 100) Y (num <= 999)
		Escribir "El número tiene tres dígitos"
	SiNo
		Escribir "El número no tiene 3 dígitos"
	FinSi
FinAlgoritmo
