//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.

Algoritmo clima
	Definir dias, max, min, promedio, i Como real
	Dimension max[100], min[100], promedio[100]
	Escribir "Ingrese la cantidad de dias que desea saber"
	leer dias
	promediar(dias, max, min, promedio)
	
	para i <- 1 Hasta dias Hacer
		Escribir "La temperatura promedio del dia ", i, " va a ser ", promedio[i]
	FinPara
	
FinAlgoritmo

SubProceso promediar(dias Por Valor, max Por Referencia, min Por Referencia, promedio Por Referencia)
	Definir i Como Entero
	para i <- 1 hasta dias Hacer
		Escribir Sin Saltar" Ingrese la temepratura maxima del dia ", i
		Leer max[i]
		Escribir Sin Saltar" Ingrese la temepratura minima del dia ", i
		Leer min[i]
		promedio[i] = (max[i] + min[i]) / 2
	FinPara
	
FinSubProceso
