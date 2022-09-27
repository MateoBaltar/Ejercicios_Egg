///Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
///10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
///mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
///debe cobrar al cliente e imprimirlo por pantalla.

Algoritmo sin_titulo
	Definir mes Como Caracter
	Definir importe, desc Como Real
	Definir mesdesc Como Logico
	
	Escribir "Ingrese el mes en el cual realizó la compra, y a continuación el monto de la compra"
	Leer mes, importe
	
	mes = Mayusculas(mes)
	
	Si mes == "SEPTIEMBRE"
		desc = (importe * 90) / 100 
		Escribir "El monto que se debe cobrar es: ", desc
	Sino
		Si mes == "OCTUBRE"
			desc = (importe * 90) / 100 
			Escribir "El monto que se debe cobrar es: ", desc
		SiNo
			Si mes == "NOVIEMBRE"
				desc = (importe * 90) / 100 
				Escribir "El monto que se debe cobrar es: ", desc
			SiNo
				Escribir "El monto que se debe cobrar es: ", importe
			FinSi
		FinSi
	FinSi
FinAlgoritmo
