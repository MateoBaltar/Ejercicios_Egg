//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
//cada venta.

Algoritmo sin_titulo
	Definir vendedores, sueldo, ventas, cobra, i, total, comision Como Real
	Dimension sueldo[100], ventas[100], cobra[100], total[100], comision[100]
	Escribir "Ingrese la cantidad de vendedores:"
	Leer vendedores
	
	Para i <- 1 Hasta vendedores Hacer
		Escribir "Ingrese el sueldo del vendedor ", i
		Leer sueldo[i]
		Escribir "Ingrese cuantas ventas realiz� el vendedor ", i
		Leer ventas[i]
		Escribir "Ingrese cuando cobr� por venta el vendedor ", i
		Leer cobra[i]
		comision[i] = ((cobra[i] * ventas[i]) * 10) / 100
		total[i] = sueldo[i] + comision[i]
	FinPara
	
	Para i <- 1 Hasta vendedores Hacer
		Escribir "El vendedor ", i, " debe cobrar $", comision[i], " pesos en comisi�n por ventas y $", total[i], " pesos como sueldo total"
	FinPara
FinAlgoritmo
