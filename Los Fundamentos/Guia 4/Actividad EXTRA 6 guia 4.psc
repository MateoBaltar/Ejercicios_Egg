//Crear una funci�n que devuelva la diferencia que hay entre el valor m�s chico de un arreglo y
//su valor m�s grande.

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
	Escribir "El n�mero mas grande es: ", mayor
	Escribir "El n�mero mas chico es: ", menor
	Escribir "La diferencia entre ambos es: "
	
FinFuncion
