//Crea un programa que pida una frase al usuario y diga cuantas palabras contiene. (Ayudita!
//los espacios podrían funcionar como advertencia para los cortes de palabras)

Algoritmo sin_titulo
	Definir frase, matriz Como Caracter
	Definir i, j , contar Como entero
	
	Escribir "Ingrese una frase"
	Leer frase
	
	contar = 1
	
	Dimension matriz(Longitud(frase))
	Para i = 0 Hasta Longitud(frase)-1
		Si Subcadena(frase,i,i) == " " Entonces
			matriz(i) = Subcadena(frase,i,i)
			contar = contar + 1
		SiNo
			matriz(i) = Subcadena(frase,i,i)
		FinSi
	FinPara
	Escribir "La frase ingresada tiene ", contar, " palabras"
	
FinAlgoritmo
