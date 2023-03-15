//Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
//su valor más grande.

Algoritmo sin_titulo
	Definir arreglo, i Como Entero
	Dimension arreglo(10)
	
	Para i = 0 Hasta 9 Hacer
		arreglo(i) = Aleatorio(0,50)
	FinPara
	
	Escribir diferenciar(arreglo)
	
FinAlgoritmo



Funcion diferencia <- diferenciar(arreglo)
	Definir diferencia, i, mayor, menor Como Entero
	mayor = 0
	menor = 100
	
	Para i = 0 Hasta 9 Hacer
		Si arreglo(i) < menor
			menor = arreglo(i)
		SiNo
			Si arreglo(i) > mayor
				mayor = arreglo(i)
			FinSi
		FinSi
	FinPara
	
	diferencia = mayor - menor
	Escribir "El número mas grande es: ", mayor
	Escribir "El número mas chico es: ", menor
	Escribir "La diferencia entre ambos es: "
	
FinFuncion
