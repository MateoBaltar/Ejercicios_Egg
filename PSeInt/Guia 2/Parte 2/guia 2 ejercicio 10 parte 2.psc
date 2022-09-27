//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
//cada venta.

Algoritmo sin_titulo
	Definir vendedores, sueldo, ventas, cobra, i, total, comision Como Real
	Dimension sueldo[100], ventas[100], cobra[100], total[100], comision[100]
	Escribir "Ingrese la cantidad de vendedores:"
	Leer vendedores
	
	Para i <- 1 Hasta vendedores Hacer
		Escribir "Ingrese el sueldo del vendedor ", i
		Leer sueldo[i]
		Escribir "Ingrese cuantas ventas realizó el vendedor ", i
		Leer ventas[i]
		Escribir "Ingrese cuando cobró por venta el vendedor ", i
		Leer cobra[i]
		comision[i] = ((cobra[i] * ventas[i]) * 10) / 100
		total[i] = sueldo[i] + comision[i]
	FinPara
	
	Para i <- 1 Hasta vendedores Hacer
		Escribir "El vendedor ", i, " debe cobrar $", comision[i], " pesos en comisión por ventas y $", total[i], " pesos como sueldo total"
	FinPara
FinAlgoritmo
