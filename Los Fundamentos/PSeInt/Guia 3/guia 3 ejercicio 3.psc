//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
//que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es
//	m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.

Algoritmo sin_titulo
	Definir num1, num2 Como Entero
	Escribir "Ingrese dos n�meros"
	Leer num1, num2
	Escribir EsMultiplo(num1,num2)
FinAlgoritmo


Funcion VoF <- EsMultiplo(num1,num2)
	Definir VoF Como Logico
	VoF = num1 mod num2 == 0 O num2 mod num1 == 0
	FinFuncion
	