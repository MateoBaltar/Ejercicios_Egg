//Programe una función recursiva que calcule la suma de un arreglo de números enteros.

Algoritmo sin_titulo
	Definir num, i, contar Como Entero
	Dimension num(20)
	contar = 0
	Para i = 0 Hasta 19 Hacer
		num(i) = Aleatorio(0,50)
	FinPara 
	
	Escribir "La suma de los numeros dentro del vector es: ", sumar(num,contar)
FinAlgoritmo



Funcion sumados <- sumar(num,contar)
	Definir sumados, i Como Entero
	
	Si contar = 18
		sumados = num(19) + num(18)
	SiNo
		sumados = sumar(num,contar+1) + num(contar)
	FinSi
	
FinFuncion
	