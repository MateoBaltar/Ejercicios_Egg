//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
//muestre por pantalla.

Algoritmo sin_titulo
	Definir num,num1, i Como Entero
	Dimension num(5), num1(5)
	
	Para i = 0 Hasta 4
		num(i) = Aleatorio(0,100)
		num1(i) = Aleatorio(0,100)
		Escribir num(i) ","  Sin Saltar
	FinPara
	Escribir ""
	Para i = 0 Hasta 4
		Escribir num1(i) ","  Sin Saltar
	FinPara
	
	
	
	
FinAlgoritmo
