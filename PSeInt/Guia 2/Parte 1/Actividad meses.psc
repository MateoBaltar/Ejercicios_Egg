///Ingresar un número del 1 ? 12 y mostrar el mes del año que corresponde, si el número ingresado
///no es correcto mostrar un "mensaje de error".

Algoritmo sin_titulo
	Definir mes Como Entero
	Escribir "Ingrese un numero de mes del año:"
	leer mes
	
	Segun mes Hacer
		1:
			Escribir "Enero"
		2:
			Escribir "Febrero"
		3:
			Escribir "Marzo"
		4:
			Escribir "Abril"
		5:
			Escribir "Mayo"
		6:
			Escribir "Junio"
		De Otro Modo:
			Escribir "No corresponde a un mes valido"
	Fin Segun
FinAlgoritmo
