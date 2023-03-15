//La empresa "Te llevo a todos lados" está destinada al alquiler de autos y tiene un sistema
//de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro
//	de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de
//	regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la
//	cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra
//	40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total
//	de $5,20 el minuto de uso. Realice un programa que permita registrar esa información y el
//	total a pagar por el cliente.

Algoritmo sin_titulo
	Definir precio, nafta, horas, minutos Como Real
	Escribir "Ingrese las horas de uso del vehiculo"
	Leer horas
	Escribir "Ingrese el consumo de nafta del vehiculo"
	Leer nafta
	
	minutos = horas * 60
	
	Si horas <= 2
		Escribir "El total a pagar es de $400 pesos, la nafta va de regalo!"
	SiNo
		Si horas > 2 Entonces
			precio = (nafta * 40) + (minutos * 5.20)
			Escribir "El total a pagar es de ", precio
		FinSi
	FinSi
	
FinAlgoritmo
