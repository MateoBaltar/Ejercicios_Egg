//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
//20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
//Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20

Algoritmo sin_titulo
	Definir i, notas, def,reg,bue,exc Como Entero
	Dimension notas(100)
	def = 0
	reg = 0
	bue = 0
	exc = 0
	
	Para i = 0 Hasta 99 Hacer
		notas(i) = Aleatorio(0,20)
	FinPara
	
	Para i = 0 Hasta 99 Hacer
		Si notas(i) >= 16
			exc = exc + 1
		SiNo
			Si notas(i) >= 11 Y notas(i) <= 15
				bue = bue + 1
			SiNo
				Si notas(i) >= 6 Y notas(i) <= 10
					reg = reg + 1
				SiNo
					Si notas(i) <= 5
						def = def + 1
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	
	Escribir "Hay ", def, " estudiantes deficientes"
	Escribir "Hay ", reg, " estudiantes regulares"
	Escribir "Hay ", bue, " estudiantes buenos"
	Escribir "Hay ", exc, " estudiantes exelentes"
	
	
FinAlgoritmo
