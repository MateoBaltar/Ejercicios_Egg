//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
//	función Subcadena().

Algoritmo sin_titulo
	Definir frase, letra Como Caracter
	Escribir "Escriba una frase"
	Leer frase
	Escribir "Escriba la letra que desea buscar dentro de la frase"
	leer letra
	Escribir "La cantidad de letras ", letra, " en la frase es: " buscar(frase,letra)
	
FinAlgoritmo

Funcion letras <- buscar(frase, letra)
	Definir letras, i Como Entero
	Definir mayus, mayusl Como Caracter
	mayus = Mayusculas(frase)
	mayusl = Mayusculas(letra)
	letras = 0
	Para i <- 0 Hasta Longitud(frase) Hacer
		Si Subcadena(mayus,i,i) == mayusl
			letras = letras + 1
		FinSi
	FinPara
FinFuncion
	