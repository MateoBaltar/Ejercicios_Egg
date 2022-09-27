// Realizar una función que calcule y retorne la suma de todos los divisores del número n
// distintos de n. El valor de n debe ser ingresado por el usuario.

Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	Escribir "La suma de los divisores de, " num, " es ", calcular(num)
FinAlgoritmo



Funcion divisores <- calcular(num)
	Definir divisores, i Como Entero
	divisores = 0
	
	Para i <- 1 Hasta num - 1 Hacer
		Si num MOD i == 0 Entonces
			divisores = divisores + i
		FinSi
	FinPara
	
FinFuncion
	