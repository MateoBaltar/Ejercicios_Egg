// Realice nuevamente un programa que calcule la función de Fibonacci, pero esta vez de
// manera recursiva.

Algoritmo sin_titulo
	
	Definir num, num1, num2, aux, conta Como Entero
	num1 = 0
	num2 = 1
	aux = 0
	conta = 0
	Escribir "Ingrese un número"
	Leer num
	
	Escribir "La secuencia Fibonacci del número ", num, " es: ", fibonacci(num,num1,num2,aux, conta)
	
FinAlgoritmo

Funcion dolor <- fibonacci(num, num1, num2, aux, conta)
	Definir dolor Como Entero
	
	Si conta = num
		dolor = 1
	SiNo
		dolor = 
		aux = num1 + num2
		num1 = num2
		dolor = num1
		num2 = aux
	FinSi
	
FinFuncion