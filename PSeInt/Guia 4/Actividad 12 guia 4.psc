//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz.
//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:


Algoritmo sin_titulo
	Definir i, j, contador Como Entero
	Definir frase, matriz Como Caracter
	Dimension matriz(3,3)
	contador = 0
	Hacer
		Escribir "Ingrese una palabra de 9 caracteres"
		Leer frase
	Mientras Que Longitud(frase) <> 9
	
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz(i,j) = Subcadena(frase,contador,contador)
			contador = contador + 1
		FinPara
	FinPara
	
	para i = 0 Hasta 2
		para j = 0 Hasta 2
			Escribir Sin Saltar matriz(i,j) " "
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
