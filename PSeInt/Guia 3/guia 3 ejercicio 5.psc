//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo sin_titulo
	Definir num Como entero
	Escribir "Ingrese un número"
	leer num
	Escribir "Es el numero ingresado primo?: ", esprimo(num)
	
FinAlgoritmo


Funcion primo <- esprimo(num)
	Definir primo Como Logico
	Definir i, contar Como Entero
	contar = 0
	Para i <- 1 Hasta num Hacer
		Si num mod i == 0
			contar = contar + 1
		FinSi
	FinPara
	Si contar == 2
		primo = Verdadero
	FinSi
FinFuncion
