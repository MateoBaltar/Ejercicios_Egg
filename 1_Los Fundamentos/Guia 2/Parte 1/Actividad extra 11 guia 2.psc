//El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de las
//cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
//programa que determine cuál es la nota eliminada y el promedio de los trabajos prácticos
//de un estudiante.

Algoritmo sin_titulo
	Definir num1, num2, num3, num4, promedio Como Real
	Escribir "Ingrese las 4 notas:"
	Leer num1, num2, num3, num4
	
	Si (num1 <= num2) Y (num1 <= num3) Y (num1 <= num4)
		promedio = (num2 + num3 + num4) / 3
		Escribir "El promedio es: ", promedio
	SiNo
		Si (num2 <= num1) Y (num2 <= num3) Y (num2 <= num4) Entonces
			promedio = (num1 + num3 + num4) / 3
		SiNo
			Si (num3 <= num1) Y (num3 <= num2) Y (num3 <= num4) Entonces
				promedio = (num1 + num2 + num4) / 3
			SiNo
				Si (num4 <= num1) Y (num4 <= num2) Y (num4 <= num3) Entonces
					promedio = (num1 + num2 + num3) / 3
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
