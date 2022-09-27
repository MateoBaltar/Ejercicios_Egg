//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.

Algoritmo sin_titulo
	Definir limite, num, suma Como Entero
	Escribir "Ingrese un limite positivo"
	leer limite	
	suma = 0
	Mientras limite > suma
		Escribir "El limite actual es ", limite
		Escribir "Ingrese un numero para sumarlo al total y superar el limite"
		leer num
		suma = suma + num
		Escribir "La suma actual es de ", suma
	FinMientras
	
	Escribir "La suma total supero el limite"
	
FinAlgoritmo
