//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar
//tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se
//encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un
//mensaje.

Algoritmo sin_titulo
	Definir num, i , busca, v, conta como entero
	conta = 0
	Escribir "Ingrese cuantos valores quiere ingresar"
	Leer v
	Dimension num(v)
	
	Para i = 0 Hasta v-1 Hacer
		Escribir "Ingrese un valor para num(",i,")"
		Leer num(i)
		
	FinPara
	Escribir "-------------------------------------"
	Escribir "Ingrese el numero que desea encontrar"
	Leer busca
	
	Escribir "El numero se encuentra en el o los vectores: "
	Para i = 0 Hasta v-1 Hacer
		Si num(i) == busca
			Escribir Sin Saltar i,", "
			conta = conta + 1
		FinSi
	FinPara
	
	Si conta == 0 Entonces
		Limpiar Pantalla
		Escribir "No se encuentra ese numero en los vectores"
	FinSi
FinAlgoritmo
