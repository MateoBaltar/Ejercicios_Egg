//Una empresa tiene personal de distintas �reas con distintas condiciones de contrataci�n y
//formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
//(lunes a viernes) en base a las 3 modalidades de sueldo:
//	a) comisi�n
//	b) salario fijo + comisi�n, y
//	c) salario fijo
//	a) Para la modalidad salario por comisi�n se debe ingresar el monto total de las ventas
//		realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//		empleado.
//		b) Para la condici�n de salario fijo + comisi�n, se debe ingresar el valor que se paga por
//			hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//			esa semana. En este tipo de contrato las horas extras no est�n contempladas y se fija
//			como m�ximo 40 horas por semana. La comisi�n por las ventas se calcula como 25%
//			del valor de venta total.
//			c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
//				hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
//				horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la
//				hora. Realizar un men� de opciones para poder elegir el tipo de contrato que tiene un
//              empleado.

Algoritmo sin_titulo
	Definir ventas, comision, salario, horas, phora, total Como Real
	Definir contrato Como Caracter
	Escribir "Ingrese que tipo de contrato tiene el empleado"
	Escribir "A. Comisi�n"
	Escribir "B. Salario fijo + comisi�n"
	Escribir "C. Salario fijo"
	Leer contrato

	Segun contrato Hacer
		"A":
			Escribir "Ingrese el monto total de ventas:"
			Leer ventas
			total = (40 * ventas) / 100
			Escribir "El sueldo del empleado es de: ", total
		"B":
			Escribir "Ingrese el monto total de ventas:"
			Leer ventas
			Escribir "Ingrese la cantidad de horas trabajadas:"
			Leer horas
			Escribir "Ingrese el valor por horas trabajadas:"
			Leer phora
			Si horas <= 40 Entonces
				total = (horas * phora) + ((25 * ventas) / 100)
				Escribir "El sueldo del empleado es de: ", total
			SiNo
				Escribir "La cantidad de horas no es valida"
			FinSi
		"C":
			Escribir "Ingrese la cantidad de horas trabajadas:"
			Leer horas
			Escribir "Ingrese el valor por horas trabajadas:"
			Leer phora
			Si horas <= 40 Entonces
				total = (horas * phora) 
				Escribir "El sueldo del empleado es de: ", total
			SiNo
				Si horas > 40 Entonces
					total = (40 * phora) + ((horas - 40) * (phora / 2))
					Escribir "El sueldo del empleado es de: ", total
				FinSi
			FinSi
		De Otro Modo:
			Escribir "El tipo de contrato no es valido"
	FinSegun
FinAlgoritmo
