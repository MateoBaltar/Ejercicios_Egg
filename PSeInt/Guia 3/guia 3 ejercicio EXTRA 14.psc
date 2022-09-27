//	Crear un programa que calcule la suma de los enteros positivos pares desde N hasta 2.
//	Chequear que si N es impar se muestre un mensaje de error.

Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	
	Escribir "la suma de todos los enteros positivos pares posteriores es: ", calculadora(num)
	
	
FinAlgoritmo

Funcion calcular <- calculadora(num)
	Definir calcular Como Entero
	
	Si num == 2
		calcular = 2
	SiNo
		Si num mod 2 == 0
			calcular = calculadora(num - 1) + num
		SiNo
			calcular = calculadora(num - 1)
		FinSi
	FinSi
	
	
FinFuncion

