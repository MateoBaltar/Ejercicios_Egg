//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
//	decimales

Algoritmo sin_titulo
	Definir frase Como Caracter
	
	Escribir "Ingrese un numero de hasta 3 digitos"
	Leer frase
	
	Si digitar(frase) > 999 Entonces
		Escribir "El número es de más de 3 dígitos"
	SiNo
		Escribir "El valor en digitos de la frase ingresada es: ", digitar(frase)
	FinSi
	
	
FinAlgoritmo


Funcion digitos <- digitar(frase)
	Definir digitos Como Entero
	
	digitos = ConvertirANumero(frase)
	
	
	
FinFuncion
	