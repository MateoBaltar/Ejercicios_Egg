//	Disponemos de un vector unidimensional de 20 elementos de tipo car�cter. Se pide
//	desarrollar un programa que:
//	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
//	Ayuda: utilizar la funci�n Subcadena de PSeInt.
//	b) Una vez completado lo anterior, pedirle al usuario un car�cter cualquiera y una
//	posici�n dentro del arreglo, y el programa debe intentar ingresar el car�cter en la
//	posici�n indicada, si es que hay lugar (es decir la posici�n est� vac�a o es un espacio
//	en blanco). De ser posible debe mostrar el vector con la frase y el car�cter ingresado,
//	de lo contrario debe darle un mensaje al usuario de que esa posici�n estaba ocupada.

Algoritmo sin_titulo
	Definir frase, carac, ingresa Como Caracter
	Definir i, largo, pos Como Entero
	
	Escribir "Ingrese una frase"
	Leer frase
	
	largo = Longitud(frase)
	Dimension carac(largo)
	
	Para i = 0 Hasta largo-1 Hacer
		carac(i) = Subcadena(frase,i,i)
	FinPara
	
	Escribir "Ingrese el caracter que desea ingresar a la frase"
	Leer ingresa
	Escribir "Ahora ingrese la posicion en la que desea ingresar el caracter"
	Leer pos
	
	Si carac(pos) == " " Entonces
		carac(pos) = ingresa
		
		Para i = 0 Hasta largo-1 Hacer
			Escribir Sin Saltar carac(i)
		FinPara
		
	SiNo
		Escribir "La posici�n ingresada esta ocupada"
	FinSi
	
	
FinAlgoritmo
