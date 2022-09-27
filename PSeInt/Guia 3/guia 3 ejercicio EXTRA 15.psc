//Implemente de forma recursiva una función que le dé la vuelta a una cadena de caracteres.
//NOTA: Si la cadena es un palíndromo, la cadena y su inversa coincidirán.


Algoritmo sin_titulo
	Definir frase Como Caracter
	Definir long, conta Como Entero
	Escribir "Ingrese una frase"
	Leer frase
	long = longitud(frase)
	conta = 0
	Escribir voltear(frase,long, conta)
	
FinAlgoritmo

Funcion vuelta <- voltear(frase, long, conta)
	Definir vuelta, letra Como Caracter
	
	Si conta = Longitud(frase)
		vuelta = ""
	SiNo
		letra = Subcadena(frase,conta,conta)
		vuelta = Concatenar(voltear(frase,long, conta+1), letra)
		
	FinSi
FinFuncion



