///Construir un programa que simule un menú de opciones para realizar las cuatro
///operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
///numéricos enteros. El usuario, además, debe especificar la operación con el primer
///carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
///o ?m? para la multiplicación y ?D? o ?d? para la división.

Algoritmo sin_titulo
	Definir operacion Como Caracter
	Definir num1,num2 Como real
	Escribir "Ingrese los dos numeros que desea en la operación:"
	leer num1, num2
	Escribir "S o s para suma"
	Escribir "R o r para resta"
	Escribir "M o m para multiplicación"
	Escribir "D o d para división"
	Escribir Sin Saltar "Ingrese la inicial de la operación que desea: "
	Leer operacion

	operacion = Mayusculas(operacion)
	
	Segun Subcadena(operacion,0,0) Hacer
		"S":
			Escribir "La suma de los números es: ", num1 + num2
		"R":
			Escribir "La resta de los números es: ", num1 - num2
		"M":
			Escribir "La multiplicación de los números es: ", num1 * num2
		"D":
			Escribir "La división de los números es: ", num1 / num2
		De Otro Modo:
			Escribir "La operacion deseada no es valida"
	Fin Segun
FinAlgoritmo
