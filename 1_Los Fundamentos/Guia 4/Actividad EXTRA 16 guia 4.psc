//Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina
//ofreciendo sus productos. Para tareas administrativas el país está dividido en cinco zonas:
//		Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene distintas
//		estadísticas sobre el comportamiento de sus representantes en cada zona. Se desea hacer un
//	programa que lea el monto de las ventas de los representantes en cada zona y calcule luego:
//		a) el total de ventas de una zona introducida por teclado
//		b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
//		c) el total de ventas de todos los representantes.


Algoritmo sin_titulo
	Definir matriz, i, j, menu, total, vendedor Como Entero
	Definir zona Como Caracter
	Dimension matriz(4,5)
	
	total = 0
	
	Para i = 0 Hasta 3 Hacer
		Para j = 0 Hasta 4
			matriz(i,j) = Aleatorio(1,100)
		FinPara
	FinPara
	
	Hacer
		Limpiar Pantalla
		Escribir "------Menu-----"
		Escribir "1. Total de ventas en una zona determinada"
		Escribir "2. Total de ventas de un vendedor determinado"
		Escribir "3. Total de ventas de todos los representantes"
		Escribir "4. Salir"
		Leer menu
		
		Limpiar Pantalla
		Segun menu
			1:	total = 0
				Escribir "Ingrese la zona (Norte, Sur, Este, Oeste, Centro) la cual desea saber las ventas totales:"
				Leer zona
				Segun zona
					"Norte" o "norte":
						Para i = 0 Hasta 3 Hacer
							total = total + matriz(i,0)
						FinPara
						Escribir "El total de ventas en la zona norte es: ", total
						Esperar Tecla
						
					"Sur" o "sur":
						Para i = 0 Hasta 3 Hacer
							total = total + matriz(i,1)
						FinPara
						Escribir "El total de ventas en la zona sur es: ", total
						Esperar Tecla
					"Este" o "este":
						Para i = 0 Hasta 3 Hacer
							total = total + matriz(i,2)
						FinPara
						Escribir "El total de ventas en la zona este es: ", total
						Esperar Tecla
					"Oeste" o "oeste":
						Para i = 0 Hasta 3 Hacer
							total = total + matriz(i,3)
						FinPara
						Escribir "El total de ventas en la zona oeste es: ", total
						Esperar Tecla
					"Centro" o "centro":
						Para i = 0 Hasta 3 Hacer
							total = total + matriz(i,4)
						FinPara
						Escribir "El total de ventas en la zona centro es: ", total
						Esperar Tecla
					De Otro Modo:
						Escribir "La opcion ingresada no es correcta, volviendo al menu"
						Esperar 2 Segundos
				FinSegun
				
			2: total = 0
				Hacer
					Escribir "Ingrese el numero del vendedor (0-3) que desea saber el total vendido: "
					Leer vendedor
				Mientras Que vendedor > 3
				Para i = 0 Hasta 4 Hacer
					total = total + matriz(vendedor,i)
				FinPara
				Escribir "El vendedor ", vendedor, " vendio un total de: ", total
				Esperar Tecla
			3:	total = 0
				Para i = 0 Hasta 3 Hacer
					Para j = 0 Hasta 4 Hacer
						total = total + matriz(i,j)
					FinPara
				FinPara
				Escribir "El total vendido por todos los representantes es: ", total
				Esperar Tecla
		FinSegun
		
	Mientras Que menu <> 4
	
	
	
FinAlgoritmo
