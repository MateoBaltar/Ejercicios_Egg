//Programe una función que calcule el producto de un arreglo de números enteros. Para esto
//	imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
//		igual a (V[1]*V[2]*V[3]*V[4])


Algoritmo sin_titulo
	Definir num, i, contar Como Entero
	Dimension num(20)
	contar = 0
	Para i = 0 Hasta 19 Hacer
		num(i) = Aleatorio(0,50)
	FinPara 
	
	Escribir multiplicar(num, contar)
FinAlgoritmo

Funcion producto <- multiplicar(num, contar)
	Definir producto, i Como Real
	
	Si contar = 18
		producto = num(19) * num(18)
	SiNo
		producto = multiplicar(num,contar+1) * num(contar)
		
	FinSi
	
	
FinFuncion

