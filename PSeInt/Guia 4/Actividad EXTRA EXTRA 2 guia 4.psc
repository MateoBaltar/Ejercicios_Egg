//Crea un programa que pida al usuario su nombre y apellido y los muestre escritos de la forma
//correcta (Primera letra en mayúsculas, y el resto en minúscula. Siempre debemos pensar
//que el usuario puede ingresar los datos de una forma distinta a la que yo deseaba que lo
//hiciera)

Algoritmo sin_titulo
	Definir nombre, apellido, matriz, matriz2 Como Caracter
	Definir i, j Como Entero
	
	Escribir "Ingrese un nombre:"
	Leer nombre
	Escribir "ingrese un apellido:"
	Leer apellido
	Dimension matriz(Longitud(nombre)), matriz2(Longitud(apellido))
	Para i = 0 Hasta Longitud(nombre)-1 Hacer
		Si i = 0 Entonces
			matriz(i) = Subcadena(nombre,i,i)
			matriz(i) = Mayusculas(matriz(i))
		SiNo
			matriz(i) = Subcadena(nombre,i,i)
		FinSi
	FinPara
	Para i = 0 Hasta Longitud(apellido)-1 Hacer
		Si i = 0 Entonces
			matriz2(i) = Subcadena(apellido,i,i)
			matriz2(i) = Mayusculas(matriz2(i))
		SiNo
			matriz2(i) = Subcadena(apellido,i,i)
		FinSi
	FinPara
	
	Para i = 0 Hasta Longitud(nombre)-1 Hacer
		
		Escribir Sin Saltar matriz(i)
	FinPara
	Escribir Sin Saltar " "
	Para i = 0 Hasta Longitud(apellido)-1 Hacer
		
		Escribir Sin Saltar matriz2(i)
	FinPara
	FinAlgoritmo
