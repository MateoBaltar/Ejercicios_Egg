//Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con
//	decimales

Algoritmo sin_titulo
	Definir frase Como Caracter
	
	Escribir "Ingrese un numero de hasta 3 digitos"
	Leer frase
	
	Si digitar(frase) > 999 Entonces
		Escribir "El n�mero es de m�s de 3 d�gitos"
	SiNo
		Escribir "El valor en digitos de la frase ingresada es: ", digitar(frase)
	FinSi
	
	
FinAlgoritmo


Funcion digitos <- digitar(frase)
	Definir digitos Como Entero
	
	digitos = ConvertirANumero(frase)
	
	
	
FinFuncion
	