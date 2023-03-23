//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
//muestre por pantalla.

Algoritmo sin_titulo
	Definir num,i Como Entero
	Dimension num(5)
	
	Para i = 0 Hasta 4 Hacer
		Escribir "Ingrese un valor para num(",i,")"
		Leer num(i)
		
	FinPara
	
	Para i = 0 Hasta 4 Hacer
		Escribir num(i)
	FinPara
	
FinAlgoritmo
