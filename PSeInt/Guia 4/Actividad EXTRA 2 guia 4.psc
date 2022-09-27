//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.

Algoritmo sin_titulo
	Definir num, i, promedio Como Real
	Dimension num(5)
	promedio = 0
	
	Para i = 0 Hasta 4 
		Escribir "Ingrese un valor para el vector ", i
		Leer num(i)
	FinPara
	
	Para i = 0 Hasta 4 
		promedio = promedio + num(i)
	FinPara
	promedio = promedio / 5
	
	Escribir "El promedio de los numeros ingresados es es: ", promedio
	
FinAlgoritmo
