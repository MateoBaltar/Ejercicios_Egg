//Realice nuevamente un programa que calcule la función de Fibonacci, pero esta vez de
//manera recursiva.


Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "Ingrese un numero para saber fibonacci"
	Leer num
	
	Escribir "El valor de fibonacci es:", fibonacci(num)
	
	
	
FinAlgoritmo


Funcion devolver = fibonacci(num)
	Definir devolver Como Entero
	
	Si num == 1 o num == 2
		devolver = 1
	SiNo
		devolver = fibonacci(num-1) + fibonacci(num-2)
	FinSi
	
	
FinFuncion

