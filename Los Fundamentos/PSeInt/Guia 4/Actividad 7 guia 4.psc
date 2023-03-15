//	Crear un subproceso que rellene dos arreglos de tama�o n, con n�meros aleatorios. Despu�s,
//	hacer una funci�n que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//	funci�n debe devolver el resultado de est� validaci�n, para mostrar el mensaje en el algoritmo.
//	Nota: recordar el uso de las variables de tipo l�gico.

Algoritmo sin_titulo
	Definir num1, num2 Como Entero
	Dimension num1(20), num2(20)
	rellena1(num1)
	rellena2(num2)
	
	Si igualar(num1,num2) == Verdadero
		Escribir "Todos los valores son iguales"
	SiNo
		Escribir "Todos los valores no son iguales"
	FinSi
	
FinAlgoritmo


SubProceso rellena1(num1 Por Referencia)
	Definir i Como Entero
	
	Para i = 0 hasta 19 Hacer
		num1(i) = Aleatorio(0,10)
	FinPara
FinSubProceso

SubProceso rellena2(num2 Por Referencia)
	Definir i Como Entero
	
	Para i = 0 hasta 19 Hacer
		num2(i) = Aleatorio(0,10)
	FinPara
FinSubProceso

Funcion igual <- igualar(num1,num2)
	Definir i, contar Como Entero
	Definir igual Como Logico
	contar = 0
	Para i = 0 Hasta 19 Hacer
		Si num1(i) == num2(i)
			contar = contar + 1
		FinSi
	FinPara
	
	Si contar == 20
		igual = Verdadero
	SiNo
		igual = Falso
	FinSi
	
FinFuncion
