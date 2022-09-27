//Escribir un programa que calcule el máximo común divisor (MCD) de dos enteros positivos. Si
//M >= N una función recursiva para MCD es:
//		MCD = M, si N =0
//			MCD = MCD (N, M mod N), si N <> 0
//El programa le debe permitir al usuario ingresar los valores para M y N. Una función recursiva
//	es entonces llamada para calcular el MCD. El programa debe imprimir el valor para el MCD.



Algoritmo sin_titulo
	Definir m, n Como Entero
	
	Escribir "Ingrese dos enteros para saver su MCD"
	Leer m, n
	
	Escribir "El MCD de los dos numeros es = ", MCD(m,n)
	
	
	
FinAlgoritmo

Funcion retorno = MCD(m,n)
	Definir retorno Como Entero
	
	Si N = 0 Entonces
		retorno = M
	SiNo
		retorno = MCD(n, m mod n) 
	FinSi
	
FinFuncion

	
	