//Realizar un procedimiento que permita realizar la división entre dos números y muestre el
//cociente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 - 13 = 37 una resta realizada
//		37 - 13 = 24 dos restas realizadas
//		24 - 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

Algoritmo sin_titulo
	Definir num1, num2, cociente, residuo Como Real
	Escribir "Ingrese dos numeros"
	Leer num1, num2
	dividir(num1,num2,cociente, residuo)
	Escribir "El residuo de la division es: ", residuo
	Escribir "El cociente de la division es: ", cociente
FinAlgoritmo



SubProceso dividir(num1 Por Valor,num2 Por Valor, cociente Por Referencia, residuo Por Referencia)	
	cociente = 0
	residuo = 0
	Hacer
		Si residuo == 0 Entonces
			residuo = num1 - num2
		SiNo
			residuo = residuo - num2
		FinSi		
		cociente = cociente + 1
	Mientras Que residuo >= num2

FinSubProceso
	