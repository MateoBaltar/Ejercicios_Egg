Funcion suma <- sumar ( num1,num2 )
	Definir suma Como Entero
	suma = num1 + num2
Fin Funcion

//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le
//pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n
//calcular� la suma y lo devolver� para imprimirlo en el algoritmo.

Algoritmo sin_titulo
	Definir num1, num2 Como Entero
	Escribir "Ingrese dos numeros para sumarlos"
	leer num1, num2
	Escribir "La suma de los numeros es: ", sumar(num1,num2)
FinAlgoritmo
