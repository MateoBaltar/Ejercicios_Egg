Algoritmo Coop
	subPrograma_menu
FinAlgoritmo

SubProceso subPrograma_menu ()
	Definir cemento, arena, ladrillos, hierro8, hierro4, piedra, m2, hierro10, hierro6, pintura, iluminacion Como Real
	Definir espesor, largo, alto, ancho, i, menu Como Entero
	Definir volver, saliendo Como Caracter
	
	cemento = 0
	arena = 0
	ladrillos = 0
	hierro8 = 0
	hierro4 = 0
	piedra = 0
	m2 = 0
	hierro10 = 0
	hierro6 = 0
	pintura = 0
	iluminacion = 0
	saliendo = ""
	
	Hacer
		Escribir "----- Menu Principal -----"
		Escribir "1 - Calcular muro de ladrillo"
		Escribir "2 - Calcular viga de hormigón"
		Escribir "3 - Calcular columnas de hormigón"
		Escribir "4 - Calcular contrapisos"
		Escribir "5 - Calcular techo"
		Escribir "6 - Calcular pisos"
		Escribir "7 - Calcular pintura"
		Escribir "8 - Calcular iluminación"
		Escribir "9 - Salir"
		Escribir "--------------------------"
		Escribir "Ingrese la operación que desea realizar"
		Leer menu
		Segun menu Hacer
			1: Limpiar Pantalla
				Hacer
					Escribir "Ingrese si el muro tiene 20 o 30 cm de espesor"
					Leer espesor
				Mientras Que espesor <> 20 Y espesor <> 30
				Escribir "Ingrese el largo del muro y a continuación el alto del mismo"
				Leer largo, alto
				calcularMuro(espesor, largo, alto, m2, cemento, arena, ladrillos)
			
				Escribir "La superficie del muro es de ", m2, " m2"
				Escribir "La cantidad de materiales necesarios para un muro con esa superficie y espesor de ", espesor, " cm son:"
				Escribir cemento, " kg de cemento"
				Escribir arena, " m3 de arena"
				Escribir ladrillos, " ladrillos"
				Hacer
					Escribir "Desea volver al menú principal? (Si/No)"
					Leer volver
					Si volver = "Si" o volver = "si"
						
					SiNo
						Si volver = "no" o volver = "No"
							
						SiNo
							Escribir "La opción ingresada no es correcta"
						FinSi
					FinSi
				Mientras Que volver <> "Si"
			
			2:	Limpiar Pantalla
				Escribir "Ingrese el largo de la viga en metros"
				Leer largo
				calcularViga(largo,cemento, arena, piedra, hierro8, hierro4)
				Escribir "La cantidad de materiales para una viga de ", largo, " metros es"
				Escribir cemento, " kg de cemento"
				Escribir arena, " m3 de arena"
				Escribir piedra, " m2 de piedra"
				Escribir hierro4, " m de hierro del 4"
				Escribir hierro8, " m de hierro del 8"
				Hacer
					Escribir "Desea volver al menú principal? (Si/No)"
					Leer volver
					Si volver = "Si" o volver = "si"
						
					SiNo
						Si volver = "no" o volver = "No"
							
						SiNo
							Escribir "La opción ingresada no es correcta"
						FinSi
					FinSi
				Mientras Que volver <> "Si"
			
			3:	Limpiar Pantalla
				Escribir "Ingrese el largo de la columna"
				Leer largo
				calcularColumna(largo, cemento, arena, piedra, hierro4, hierro10)
				Escribir "La cantidad de materiales para una columna de ", largo, " metros es"
				Escribir cemento, " kg de cemento"
				Escribir arena, " m3 de arena"
				Escribir piedra, " m2 de piedra"
				Escribir hierro10, " m de hierro del 10"
				Escribir hierro4, " m de hierro del 8"
				Hacer
					Escribir "Desea volver al menú principal? (Si/No)"
					Leer volver
					Si volver = "Si" o volver = "si"
						
					SiNo
						Si volver = "no" o volver = "No"
							
						SiNo
							Escribir "La opción ingresada no es correcta"
						FinSi
					FinSi
				Mientras Que volver <> "Si"
			
			4:	Limpiar Pantalla
				Escribir "Ingrese el espesor, ancho y largo del contrapiso"
				Leer espesor, ancho, largo
				calcularContrapisos(espesor, ancho, largo, cemento, arena, piedra, m2)
				Escribir "La cantidad de materiales necesarios para un contrapiso de ", m2, " m2 son:"
				Escribir cemento, " kg de cemento"
				Escribir arena, " m3 de arena"
				Escribir piedra, " m3 de piedra"
				Hacer
					Escribir "Desea volver al menú principal? (Si/No)"
					Leer volver
					Si volver = "Si" o volver = "si"
						
					SiNo
						Si volver = "no" o volver = "No"
							
						SiNo
							Escribir "La opción ingresada no es correcta"
						FinSi
					FinSi
				Mientras Que volver <> "Si"
			
			5: Limpiar	Pantalla
				Escribir "Ingrese el espesor, ancho y largo del techo"
				Leer espesor, ancho, largo
				calcularTecho(espesor, ancho, largo, m2, cemento, arena, piedra, hierro8, hierro6)
				Escribir "La cantidad de materiales necesarios para un techo de ", m2, " m2 son:"
				Escribir cemento, " kg de cemento"
				Escribir arena, " m3 de arena"
				Escribir piedra, " m3 de piedra"
				Escribir hierro8, " m de hierro del 8"
				Escribir hierro6, " m de hierro del 6"
				Hacer
					Escribir "Desea volver al menú principal? (Si/No)"
					Leer volver
					Si volver = "Si" o volver = "si"
						
					SiNo
						Si volver = "no" o volver = "No"
							
						SiNo
							Escribir "La opción ingresada no es correcta"
						FinSi
					FinSi
				Mientras Que volver <> "Si"
			
			6: Limpiar Pantalla
				Escribir "Ingrese el ancho y largo del paño de piso a colocar"
				Leer ancho, largo
				calcularPisos(ancho, largo, m2)
				Escribir "Necesitara ", m2, " m2 de paño de piso"
				Hacer
					Escribir "Desea volver al menú principal? (Si/No)"
					Leer volver
					Si volver = "Si" o volver = "si"
						
					SiNo
						Si volver = "no" o volver = "No"
							
						SiNo
							Escribir "La opción ingresada no es correcta"
						FinSi
					FinSi
				Mientras Que volver <> "Si"
			
			7: Limpiar Pantalla
				Escribir "Ingrese la superficie del muro a pintar"
				Leer m2
				calcularPintura(m2, pintura)
				Escribir "Necesitara ", pintura, " litros de pintura"
				Hacer
					Escribir "Desea volver al menú principal? (Si/No)"
					Leer volver
					Si volver = "Si" o volver = "si"
						
					SiNo
						Si volver = "no" o volver = "No"
							
						SiNo
							Escribir "La opción ingresada no es correcta"
						FinSi
					FinSi
				Mientras Que volver <> "Si"
			
			8: Limpiar Pantalla
				Escribir "Ingrese la superficie de la habitacion"
				Leer m2
				calcularIluminacion(m2, iluminacion)
				Escribir "La cantidad minima de superficie de iluminacion natural es de ", m2, " m2"
				Escribir "--------------------------"
				Hacer
					Escribir "Desea volver al menú principal? (Si/No)"
					Leer volver
					Si volver = "Si" o volver = "si"
						
					SiNo
						Si volver = "no" o volver = "No"
							
						SiNo
							Escribir "La opción ingresada no es correcta"
						FinSi
					FinSi
				Mientras Que volver <> "Si"
			9: Limpiar	Pantalla
				
			De Otro Modo:
				Escribir "La opción ingresada no es correcta"
				Esperar 3 segundos
		FinSegun
		
		Limpiar Pantalla
		Escribir "Saliendo del programa"
		para i <- 1 Hasta 3 Hacer
			Escribir Sin Saltar Concatenar(saliendo, ".")
			Esperar 1 Segundos
		FinPara
		Limpiar Pantalla
	Mientras Que menu <> 9
	
FinSubProceso


SubProceso calcularMuro(espesor Por Valor, largo Por Valor, alto Por Valor, m2 Por Referencia, cemento Por Referencia, arena Por Referencia, ladrillos Por Referencia)
	m2 = largo * alto
	Si espesor == 30 Entonces
		cemento = 15.2 * m2
		arena = 0.115 * m2
		ladrillos = 120 * m2
	Sino
		Si espesor == 20 entonces
			cemento = 10.9 * m2
			arena = 0.09 * m2
			ladrillos = 90 * m2
		FinSi
	FinSi
FinSubProceso

SubProceso calcularViga(largo Por Valor,cemento Por Referencia, arena Por Referencia, piedra Por Referencia, hierro8 Por Referencia, hierro4 Por Referencia)
	cemento = largo * 9
	arena = largo * 0.02
	piedra = largo * 0.02
	hierro8 = largo * 4
	hierro4 = largo * 3
FinSubProceso

SubProceso calcularColumna(largo Por Valor, cemento Por Referencia, arena Por Referencia, piedra Por Referencia, hierro4 Por Referencia, hierro10 Por Referencia)
	cemento = largo * 7.5
	arena = largo * 0.016
	piedra = largo * 0.016
	hierro10 = largo * 6
	hierro4 = largo * 3
FinSubProceso
SubProceso calcularContrapisos(espesor Por Valor, ancho Por Referencia, largo Por Referencia, cemento Por Referencia, arena Por Referencia, piedra Por Referencia, m2 Por Referencia)
	m2 = largo * ancho	
	
	cemento = m2 * 105
	arena = m2 * 0.45
	piedra = m2 * 0.9
FinSubProceso

SubProceso calcularTecho(espesor Por Valor, ancho Por Referencia, largo Por Referencia, m2 Por Referencia, cemento Por Referencia, arena Por Referencia, piedra Por Referencia, hierro8 Por Referencia, hierro6 Por Referencia)
	m2 = largo * ancho	
	
	cemento = m2 * 33
	arena = m2 * 0.072
	piedra = m2 * 0.072
	hierro8 = m2 * 7
	hierro6 = m2 * 4
	
FinSubProceso

SubProceso calcularPisos(ancho Por Valor, largo Por Valor, m2 Por Referencia)
	m2 = (ancho * largo) * 0.10
FinSubProceso

SubProceso calcularPintura(m2 por valor, pintura Por Referencia)
	pintura = m2 / 6
	
FinSubProceso

SubProceso calcularIluminacion(m2 Por Valor, iluminacion Por Referencia)
	
	iluminacion = m2 * 0.20
FinSubProceso