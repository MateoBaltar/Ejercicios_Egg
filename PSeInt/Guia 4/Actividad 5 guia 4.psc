//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el valor
//más grande del vector.

Algoritmo sin_titulo
	Definir num, mayor,i Como Entero
	Dimension num(10)
	mayor = 0
	Para i = 0 Hasta 9 Hacer
		Escribir "Ingrese un valor para el num(",i,")"
		Leer num(i)
	FinPara
	
	para i = 0 Hasta 9 Hacer
		Si num(i) > mayor
			mayor = num(i)
		FinSi
	FinPara
	Escribir "El valor mas grande dentro del vector es: ", mayor
FinAlgoritmo
