// Escribir una función recursiva que devuelva la suma de los primeros N enteros.
Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "Ingrese un número entero"
	Leer num
	
	Escribir "La suma de los numeros enteros es: ", sumar(num)
	
FinAlgoritmo


funcion sumas <- sumar(num)
	Definir sumas Como Entero
	
	Si num == 0 o num == 1
		sumas = 1
	SiNo
		sumas = sumar(num - 1) + num
	FinSi
	
FinFuncion

	