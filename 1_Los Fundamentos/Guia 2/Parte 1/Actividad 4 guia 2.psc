///Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el
///usuario ingresa una frase o palabra de 6 caracteres se deber� de imprimir un mensaje por
///pantalla que diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO".
///Nota: investigar la funci�n Longitud() de PseInt.

Algoritmo sin_titulo
	Definir frase Como Caracter
	Escribir "Infrese una frase o palabra de 6 caracteres"
	leer frase
	
	Si Longitud(frase) = 6
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
FinAlgoritmo
