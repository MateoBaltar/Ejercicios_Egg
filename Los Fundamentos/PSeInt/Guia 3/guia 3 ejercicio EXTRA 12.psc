Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "Ingrese un número"
	Leer num
	escalera(num)
	
FinAlgoritmo


SubProceso escalera(num)
	Definir i,n Como Entero
	
	Para i <- 1 Hasta num Hacer
		para n = 1 Hasta i Hacer
			Escribir n Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
	