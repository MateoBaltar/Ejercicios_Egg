//Hacer un algoritmo que lea un n�mero por el teclado y determine si tiene tres d�gitos.

Algoritmo sin_titulo
	Definir num, digitos Como Entero
	Escribir "Ingrese un n�mero entero"
	Leer num
	
	Si num < 0
		num = abs(num)
	FinSi
	
	Si (num >= 100) Y (num <= 999)
		Escribir "El n�mero tiene tres d�gitos"
	SiNo
		Escribir "El n�mero no tiene 3 d�gitos"
	FinSi
FinAlgoritmo
