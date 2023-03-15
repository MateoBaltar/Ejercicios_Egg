//	Realizar un programa con el siguiente men� y le pregunte al usuario que quiere hacer hasta
//	que ingrese la opci�n Salir:
//	A. Llenar Vector A. Este vector es de tama�o N y se debe llenar de manera aleatoria
//	usando la funci�n Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector tambi�n es de tama�o N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//	a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//	elemento. Ejemplo: C = B - A
//	E. Mostrar. Esta opci�n debe permitir al usuario decidir qu� vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.
//	NOTA: El rango de los n�meros aleatorios para los Vectores ser� de [-100 a 100]. La longitud
//	para todos los vectores debe ser la misma, por lo tanto, esa informaci�n s�lo se solicitar� una
//	vez.

Algoritmo sin_titulo
	Definir vecA, vecB, vecC, dimc, i, aleatorio1,aleatorio2, aleamax Como Real
	Definir menu, eleccion Como Caracter
	aleatorio1 = Aleatorio(1,10)
	Dimension vecA(aleatorio1), vecB(aleatorio1), vecC(aleatorio1)
	
	Hacer
		Limpiar Pantalla
		Escribir "------ Menu ------"
		Escribir "A. Llenar el Vector A"
		Escribir "B. Llenar el Vector B"
		Escribir "C. Llenar el Vector C (suma Vector A con vector B)"
		Escribir "D. Llenar el Vector C (resta Vector B con vector A)"
		Escribir "E. Mostrar Vector A, B o C"
		Escribir "F. Salir"
		Escribir "------------------"
		Escribir "Ingrese un valor para el menu"
		Leer menu
		
		Segun menu Hacer
			"A":Limpiar Pantalla 
				Para i = 0 Hasta aleatorio1-1 Hacer
					Escribir "Ingrese un valor para el Vector A n�mero ", i
					Leer vecA(i)
				FinPara
				Escribir "Presione una tecla para volver al menu"
				Esperar Tecla
				
			"B":Limpiar Pantalla 
				Para i = 0 Hasta aleatorio1-1 Hacer
					Escribir "Ingrese un valor para el Vector B n�mero ", i
					Leer vecB(i)
				FinPara
				Escribir "Presione una tecla para volver al menu"
				Esperar Tecla
			
			"C":Limpiar Pantalla 
				Para i = 0 Hasta aleatorio1-1 Hacer
					vecC(i) = vecA(i) + vecB(i)
				FinPara
			
			"D":Limpiar Pantalla 
				Para i = 0 Hasta aleatorio1-1 Hacer
					vecC(i) = vecB(i) - vecA(i)
				FinPara
			
			"E": Limpiar Pantalla 
				Escribir "Ingrese el vector (A,B o C) que desea saber los valores"
				Leer eleccion
				
				Segun eleccion
					"A": Para i = 0 Hasta aleatorio1-1 Hacer
							Escribir "El valor del num " i " en el Vector A es:" vecA(i)
						FinPara
					"B": Para i = 0 Hasta aleatorio1-1 Hacer
							Escribir "El valor del num " i " en el Vector B es:" vecB(i)
						FinPara
				
					"C": Para i = 0 Hasta aleatorio1-1 Hacer
							Escribir "El valor del num " i " en el Vector C es:" vecC(i)
						FinPara
					De Otro Modo:
						Escribir "El valor ingresado es incorrecto"
				FinSegun
				Escribir "Presione una tecla para volver al menu"
				Esperar Tecla
				
			"F": Limpiar Pantalla
				Escribir "Adios!"
				Esperar 2 Segundos
			De Otro Modo:
				Limpiar Pantalla
				Escribir "El valor ingresado no es correcto"
				Esperar 1 Segundos
		FinSegun
	Mientras Que menu <> "F"
FinAlgoritmo
