//////Solicitar al usuario que ingrese dos n�meros enteros y determinar si ambos son pares o
//////	impares. Mostrar en pantalla un mensaje que indique "Ambos n�meros son pares" siempre
//////	y cuando cumplan con la condici�n. En caso contrario se deber� imprimir el siguiente
//////	mensaje "Los n�meros no son pares, o uno de ellos no es par".
//////Nota: investigar la funci�n mod de PseInt.

Algoritmo sin_titulo
	Definir num1, num2, par1, par2 Como Entero
	Escribir "Ingrese dos numeros enteros: "
	Leer num1, num2
	
	par1 = num1 MOD 2
	par2 = num2 MOD 2
	
	Si (par1 == 0) Y (par2 == 0)
		Escribir "Los dos numeros son pares"
	SiNo
		Si (par1 <> 0) Y (par2 == 0)
			Escribir "Los n�meros no son pares, o uno de ellos no es par"
		SiNo
			Si (par1 == 0) Y (par2 <> 0)
				Escribir "Los n�meros no son pares, o uno de ellos no es par"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
