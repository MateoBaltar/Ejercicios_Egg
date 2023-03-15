Funcion suma <- sumar ( num1,num2 )
	Definir suma Como Entero
	suma = num1 + num2
Fin Funcion

//Realizar una función que calcule la suma de dos números. En el algoritmo principal le
//pediremos al usuario los dos números para pasárselos a la función. Después la función
//calculará la suma y lo devolverá para imprimirlo en el algoritmo.

Algoritmo sin_titulo
	Definir num1, num2 Como Entero
	Escribir "Ingrese dos numeros para sumarlos"
	leer num1, num2
	Escribir "La suma de los numeros es: ", sumar(num1,num2)
FinAlgoritmo
