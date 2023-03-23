//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
//arreglo.


Algoritmo sin_titulo
	Definir num, suma, resta, multi, i Como Real
	Dimension num(10)
	suma = 0
	reta = 0
	multi = 1
	Para i = 0 Hasta 9 Hacer
		Escribir "Ingrese un valor para num(",i,")"
		Leer num(i)
	FinPara
	
	Para i = 0 Hasta 9 Hacer
		suma = suma + num(i)
		resta = resta - num(i)
		multi = multi * num(i)
	FinPara
	
	Escribir "La suma de todos los números en el vector es: ", suma
	Escribir "La resta de todos los números en el vector es: ", resta
	Escribir "La multiplicación de todos los números en el vector es: ", multi
	
FinAlgoritmo
