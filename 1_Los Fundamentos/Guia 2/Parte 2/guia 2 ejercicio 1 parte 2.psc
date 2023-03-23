//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota
//		se pedirá de nuevo hasta que la nota sea correcta.

Algoritmo sin_titulo
	Definir nota Como Entero
	Escribir "Ingrese una nota entre 0 y 10"
	leer nota
	
	Mientras (nota <= 0) O (nota >= 10)
		Escribir "La nota ingresada no es valida, ingrese una nuevamente"
		leer nota
	FinMientras
	
	Escribir "Usted ingreso una nota correctamente"
FinAlgoritmo
