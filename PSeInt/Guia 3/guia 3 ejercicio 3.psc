//Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer número múltiplo del segundo y devuelva verdadero si el primer número es
//	múltiplo del segundo, sino es múltiplo que devuelva falso.

Algoritmo sin_titulo
	Definir num1, num2 Como Entero
	Escribir "Ingrese dos números"
	Leer num1, num2
	Escribir EsMultiplo(num1,num2)
FinAlgoritmo


Funcion VoF <- EsMultiplo(num1,num2)
	Definir VoF Como Logico
	VoF = num1 mod num2 == 0 O num2 mod num1 == 0
	FinFuncion
	