///Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
///es una ?A?. Si la primera letra es una ?A?, se deberá de imprimir un mensaje por pantalla
///que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". Nota:
///investigar la función Subcadena de PseInt.

Algoritmo sin_titulo
	Definir frase Como Caracter
	Escribir "Ingrese una frase o palabra"
	leer frase
	
	Si Subcadena(frase,0,0) = "A"
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
FinAlgoritmo
