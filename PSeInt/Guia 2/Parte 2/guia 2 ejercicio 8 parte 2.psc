//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
//sus estudiantes:
//	§ Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//reprueba el curso si tiene una nota final inferior a 6.5
//	§ Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//	§ La mayor nota obtenida en las exposiciones.
//	§ Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//	El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//	las 3 notas y calculará todos informes claves que requiere el docente.

Algoritmo sin_titulo
	Definir estudiantes, final, mayor, promedio, integrador, parcial, exposicion, i, reprueba,div, promedior, suma, porcen, suma2, contar Como Real
	Dimension final[100], integrador[100], parcial[100], exposicion[100], promedio[100], reprueba[100]
	i = 1
	mayor = 0
	suma = 0
	div = 0
	suma2 = 0
	contar = 0
	Escribir "Ingrese la cantidad de estudiantes: "
	Leer estudiantes
	
	Para i <- 1 hasta estudiantes Hacer
		Escribir "Ingrese la nota del trabajo practico integrador del estudiante ", i
		Leer integrador[i]
		Si integrador[i] > 7.5
			suma2 = suma2 + 1
		FinSi
		Escribir "Ingrese la nota de la exposición del estudiante ", i
		Leer exposicion[i]
		Si exposicion[i] > mayor
			mayor = exposicion[i]
		FinSi
		Escribir "Ingrese la nota del parcial del estudiante ", i
		Leer parcial[i]
		Si (parcial[i] >= 4) y (parcial[i] <= 7.5)
			contar = contar + 1
		FinSi
		promedio[i] = (integrador[i] + exposicion[i] + parcial [i]) / 3
		Si promedio[i] < 6.5
			suma = suma + promedio[i]
			div = div + 1
		FinSi
	FinPara
	
	promedior = suma / div
	porcen = (suma2 * 100) / estudiantes
	
	Escribir "El promedio final de los estudiantes que reprobaron el curso es: ", promedior
	Escribir "---------------------------------------------"
	Escribir "El porcentaje de estudiantes con una nota de integrador mayor a 7.5 es: ", porcen,"%"
	Escribir "---------------------------------------------"
	Escribir "El total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 es: ", contar
	Escribir "---------------------------------------------"
	Escribir "La mayor nota obtenida en las exposiciones es: ", mayor
	
FinAlgoritmo
