///Construir un programa que simule un men� de opciones para realizar las cuatro
///operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
///num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
///car�cter de la operaci�n que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
///o ?m? para la multiplicaci�n y ?D? o ?d? para la divisi�n.

Algoritmo sin_titulo
	Definir operacion Como Caracter
	Definir num1,num2 Como real
	Escribir "Ingrese los dos numeros que desea en la operaci�n:"
	leer num1, num2
	Escribir "S o s para suma"
	Escribir "R o r para resta"
	Escribir "M o m para multiplicaci�n"
	Escribir "D o d para divisi�n"
	Escribir Sin Saltar "Ingrese la inicial de la operaci�n que desea: "
	Leer operacion

	operacion = Mayusculas(operacion)
	
	Segun Subcadena(operacion,0,0) Hacer
		"S":
			Escribir "La suma de los n�meros es: ", num1 + num2
		"R":
			Escribir "La resta de los n�meros es: ", num1 - num2
		"M":
			Escribir "La multiplicaci�n de los n�meros es: ", num1 * num2
		"D":
			Escribir "La divisi�n de los n�meros es: ", num1 / num2
		De Otro Modo:
			Escribir "La operacion deseada no es valida"
	Fin Segun
FinAlgoritmo
