///Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al
///usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
///mostrar un mensaje por pantalla indicándolo.

Algoritmo sin_titulo
	Definir actual, minimo Como Entero
	Escribir "Ingrese su sueldo actual y seguido el sueldo minimo"
	Leer actual, minimo
	
	Si actual > minimo
		Escribir "El suelo actual es mayor al minimo"
	SiNo
		Escribir "El sueldo minimo es mayor al actual"
	FinSi
FinAlgoritmo
