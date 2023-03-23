//	Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//	almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//	debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.

Algoritmo sin_titulo
	Definir nombre Como Caracter
	Definir long, x, i, e Como Entero
	
	Escribir "Ingrese cuantos nombres desea ingresar"
	Leer x
	
	Dimension nombre(x), long(x)
	
	Para i = 0 hasta x-1 Hacer
		Escribir "Ingrese el nombre número ", i
		Leer nombre(i)
		long(i) = Longitud(nombre(i))		
	FinPara
	

	Para i = 0 Hasta x-1 Hacer
		Escribir Sin Saltar nombre(i),": "  long(i)
		Escribir ""
	FinPara

	
FinAlgoritmo
