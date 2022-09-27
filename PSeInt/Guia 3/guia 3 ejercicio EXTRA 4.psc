//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.
//			
//		El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//			de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además,
//			debemos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era
//				festivo o no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.

Algoritmo sin_titulo
	Definir nombre, turno, feriadot Como Caracter
	Definir dia,horas Como Entero
	Definir feriado Como Logico
	
	Escribir "Ingrese le nombre del trabajador"
	Leer nombre
	
	Escribir "Ingrese el dia de la semana que trabajo"
	Leer dia
	
	Escribir "Cuantas horas trabajo?"
	Leer horas
	
	Escribir "Ingrese si el turno fue diurno o nocturno"
	Leer turno
	
	Escribir "Fue el día de la semana festivo o no?"
	Leer feriadot
	Si feriadot == "Si"
		Feriado = Verdadero
	SiNo
		Si feriadot == "No" 
			feriado = Falso
		SiNo
			Escribir "El dato ingresado no es valido"
		FinSi
	FinSi
	
	Escribir "El jornal diario del empleado ", nombre, " es: ", calcular(turno,feriado,horas)
FinAlgoritmo


Funcion calculo <- calcular(turno, feriado, horas)
	Definir calculo Como Real
	calculo = 0
	
	Si turno == "Diurno"
		calculo = horas * 90
	SiNo
		calculo = horas * 125
	FinSi
	
	Si feriado == Verdadero
		Si turno == "Diurno"
			calculo = calculo + (calculo * 0.10)
		SiNo
			calculo = calculo + (calculo * 0.15)
		FinSi
	FinSi
	
FinFuncion
